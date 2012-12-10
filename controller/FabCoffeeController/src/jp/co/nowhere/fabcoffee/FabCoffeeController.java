package jp.co.nowhere.fabcoffee;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import jp.co.nowhere.fabcoffee.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * FabCoffee example for the Maker Expo Tokyo 2012
 * This module implements controller on the Android-side.
 * @author Shunsuke Ishikuro
 */

public class FabCoffeeController extends Activity {		
	private static final int MOVE_UP = 1;
	private static final int MOVE_DOWN = 2;
	private static final int MOVE_LEFT = 3;
	private static final int MOVE_RIGHT = 4;
	private static final int PUSH = 5;
	private static final int NONE = 6;
	private int mState;
	
	private static final String TAG = "FabCoffeeController";
	private static final String SERVICE_NAME = "FabCoffeeController";
	private static final UUID SERVICE_ID = UUID.fromString("001101-0000-1000-8000-00805F9B34FB");
	AcceptThread thread;
	private BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	private final int REQUEST_ENABLE_BT = 114;

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab_coffee_controller);
        mState = NONE;
        
        Log.d(TAG, "--OnCreate--");
        
        if (mBluetoothAdapter == null) {
        	Log.e(TAG, "adapter error.");
        }
        
        if (!mBluetoothAdapter.isEnabled()) {
        	Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        	startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        }
        
        thread = new AcceptThread();
        thread.start();
        
        Button buttonUp    = (Button) findViewById(id.up);
        Button buttonDown  = (Button) findViewById(id.down);
        Button buttonLeft  = (Button) findViewById(id.left);
        Button buttonRight = (Button) findViewById(id.right);
        Button buttonPush  = (Button) findViewById(id.push);
        
        buttonUp.setOnTouchListener(new View.OnTouchListener() {			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					mState = MOVE_UP;
				} else if (event.getAction() == MotionEvent.ACTION_UP) {
					mState = NONE;
				}
				return false;
			}
		});
        
        buttonDown.setOnTouchListener(new View.OnTouchListener() {			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					mState = MOVE_DOWN;
				} else if (event.getAction() == MotionEvent.ACTION_UP) {
					mState = NONE;
				}
				return false;
			}
		});
        
        buttonLeft.setOnTouchListener(new View.OnTouchListener() {			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					mState = MOVE_LEFT;
				} else if (event.getAction() == MotionEvent.ACTION_UP) {
					mState = NONE;
				}
				return false;
			}
		});

        buttonRight.setOnTouchListener(new View.OnTouchListener() {			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					mState = MOVE_RIGHT;
				} else if (event.getAction() == MotionEvent.ACTION_UP) {
					mState = NONE;
				}
				return false;
			}
		});
        
        buttonPush.setOnTouchListener(new View.OnTouchListener() {			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					mState = PUSH;
					Log.d(TAG, "--PUSH--");
				} else if (event.getAction() == MotionEvent.ACTION_UP) {
					mState = NONE;
				}
				return false;
			}
		});
        
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.d(TAG, "--onResume--");
    	if (thread == null) {
    		thread.start();
    	}
    }
    
    @Override
    protected void onDestroy() {
    	Log.d(TAG, "--onDestroy--");
    	if (thread != null) {
    		thread.cancel();
    	}
    }
    
    private class AcceptThread extends Thread {
    	private BluetoothServerSocket serverSocket;
    	
    	public AcceptThread() {
    		try {
    			serverSocket = mBluetoothAdapter.listenUsingInsecureRfcommWithServiceRecord(SERVICE_NAME, SERVICE_ID);
    		} catch (IOException e) { }
    	}
    	
    	public void run() {
    		BluetoothSocket socket = null;
    		Log.d(TAG, "--THREAD--");
    		while (true) {
    			try {
    				Log.d(TAG, "waiting...");
    				socket = serverSocket.accept();
    			} catch (IOException e) {
    				Log.e(TAG, "Fail to accept.", e);
    				break;
    			}
    			Log.d(TAG, "A connection was accepted.");
    			if (socket != null) {
    				connect(socket);
    			}
    			Log.d(TAG, "The session was closed. Listen again.");
    		}
    	}
    
    	private void connect(BluetoothSocket socket) {
    		try {
    			InputStream in = socket.getInputStream();
    			OutputStream out = socket.getOutputStream();

    			Log.d(TAG, "Connection established.");
    			while (in.available() <= 0) {
    				out.write("S".getBytes());
    			}
    			out.flush();
    			while (true) {
    				byte[] buffer = new byte[1];
    				int bytes = in.read(buffer);
    				Log.d(TAG, "read");
    				if (buffer[0] == 'q') {
    					out.write(("b").getBytes());
    					break;
    				} else {
    					out.write(String.valueOf(mState).getBytes());
            			Log.d(TAG, "input =" + new String(buffer, 0, bytes));
            			out.write(new String (buffer, 0, bytes).getBytes());	
    				}
    			}
    			socket.close();
    		} catch (IOException e) {
    			Log.e(TAG, "Something bad happened!", e);
    		}
    	}

    	public void cancel() {
    		try {
    			serverSocket.close();
    			Log.d(TAG, "The server socket is closed.");
    		} catch (IOException e) { }
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_fab_coffee_controller, menu);
        return true;
    }
}
