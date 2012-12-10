import java.io.*;
import javax.bluetooth.RemoteDevice;
import lejos.nxt.*;
import lejos.nxt.comm.*;

/**
 * FabCoffee Bluetooth Receiver for Maker Faire Tokyo 2012
 * WARNING: this code wasn't tested yet, thus please check before uploading it to the actual device
 * @author Shunsuke Ishikuro
 */

public class FCReceiver {
	public static DataOutputStream out;
	public static DataInputStream in;
	public static RemoteDevice btrd;
	public static BTConnection btc;

	public static int commandValue, transmitReceived;
	public static boolean[] control = new boolean[6];
	public static boolean[] command = new boolean[6];

	private static LCDOutputStream lcdOut;

	public static void main(String [] args)
	{

		lcdOut = new LCDOutputStream();
		lcdOut.write('0');

		connect();

//		while (!Button.ESCAPE.isDown()) {
//			control = checkCommand();
//			move(control);
//		}
//
//		try {
//			out.writeBytes("q");
//		} catch (Exception e) { }
	}

	public static boolean[] checkCommand()
	{
		try {
			transmitReceived = in.readInt();
			if (transmitReceived == 1) command[0] = true;
			if (transmitReceived == 2) command[1] = true;
			if (transmitReceived == 3) command[2] = true;
			if (transmitReceived == 4) command[3] = true;
			if (transmitReceived == 5) command[4] = true;

			if (transmitReceived == 6) {
				command[0] = false;
				command[1] = false;
				command[2] = false;
				command[3] = false;
				command[4] = true;
			}
			out.writeByte(0);
		} catch (IOException e) { }

		return command;
	}

	public static void move(boolean[]D)
	{
		boolean[] direction = new boolean[4];

		direction[0] = D[0];
		direction[1] = D[1];
		direction[2] = D[2];
		direction[3] = D[3];
		
		boolean push = D[4];

		Motor.A.setSpeed(50);
		Motor.C.setSpeed(50);

		if (direction[0] == true) Motor.A.forward();
		if (direction[1] == true) Motor.A.backward();
		if (direction[2] == true) Motor.C.forward();
		if (direction[3] == true) Motor.C.backward();

		if (direction[0] == false &&
				direction[1] == false &&
				direction[2] == false &&
				direction[3] == false) {
			Motor.A.stop();
			Motor.C.stop();
				}

		if (push == true) {
			//PUSH
		}
	}

	public static void connect()
	{
		String name = "Nexus One";
		LCD.drawString("Connecting...", 0, 0);

		btrd = Bluetooth.getKnownDevice(name);
		if (btrd == null) {
			LCD.clear();
			LCD.drawString("No such device", 0 , 0);
			Button.waitForAnyPress();
			System.exit(1);
		}

		LCD.clear();
		LCD.drawString("Connected to " + name, 0, 0);

		btc = Bluetooth.connect(btrd);
		if (btc == null) {
			LCD.clear();
			LCD.drawString("Connect fail", 0, 0);
			Button.waitForAnyPress();
			System.exit(1);
		}

		in = btc.openDataInputStream();
		out = btc.openDataOutputStream();
		try {
			while (in.available() == 0) { }
			LCD.clear();
			byte[] buffer = new byte[1024];
			int bytes;
			while (in.read(buffer) <= 0) { }
			LCD.drawString("read", 0, 0);
			while (!Button.ESCAPE.isDown()) {
				out.writeInt(0);
				out.flush();
			}
		} catch (IOException e) { }
	}
}

