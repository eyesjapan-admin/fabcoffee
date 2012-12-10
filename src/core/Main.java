package core;

import javax.microedition.lcdui.*;

import fabplot.FabPlot;
import lejos.nxt.*;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

/**
 * FabCoffee example for the Maker Expo
 * @author Denis Vazhenin
 * @author Frederik Schlupkothen
 */

public class Main {
	
	/**
 	 * Converts image in standart XBitmap format into leJOS image
 	 * @param w image width
 	 * @param h image height
 	 * @param img image in xbm format
 	 * @return image type of Image
 	 */
	public static Image xbmImage(int w, int h, byte[] img)
		{
			byte[] out = new byte[((h + 7) / 8) * w];
			int inputIndex = 0;
			int outputIndex = 0;
			for (int y = 0; y < h; y++) {
				byte outBit = (byte) (1 << (y % 8));
				byte inBit = 1;
				outputIndex = (y / 8) * w;
				for (int x = 0; x < w; x++){
					if ((img[inputIndex] & inBit) != 0)
						out[outputIndex] |= outBit;
						outputIndex++;
						inBit <<= 1;
					if (inBit == 0){
						inputIndex++;
						inBit = 1;
					}
				} // for x
				if (inBit != 0) inputIndex++;
			} // for y
		return new Image(w, h, out);
	}

	/**
	 * Draw greetings picture on LCD display
	 * @throws InterruptedException 
	 */
	public static void drawGreetings() throws InterruptedException{

		Logo fabcoffee = new Logo();
		byte[] fab_logo	= fabcoffee.getFabcoffeeLogo();

		final int SW = LCD.SCREEN_WIDTH;
		final int SH = LCD.SCREEN_HEIGHT;
		Image logoFabcoffee	=xbmImage(SW, SH, fab_logo);

		//Graphics g = new Graphics();
		//g.autoRefresh(false);
		//g.clear();
		
		//drawing image from the bottom of the screen
		for (int i = 0; i < SH; i++) {
			LCD.bitBlt(logoFabcoffee.getData(), SW, SH, 0, 0, 0, i - SH, SW, SH, LCD.ROP_COPY);
			LCD.refresh();
			Thread.sleep(20);
		}

		Button.waitForAnyPress();

		//fade out image changing LCD contrast value
		for (int i = 0x60; i >= 0; i = i - 10) {
			Thread.sleep(200);
			LCD.setContrast(i);
			LCD.refresh();
		}
		Thread.sleep(25);
		
		//return LCD to original state before drawing anything
		LCD.clear();
		LCD.setContrast(0x60);
		LCD.refresh();
	}
	
	/**
	 * Wait for user response before exit
	 */
	public static void waitExit(){
		Button.ENTER.waitForPressAndRelease();
		System.exit(0);
	}
	
	/**
	 * Make a pause and wait for response{
	 */

	/**
	 * Main module that demonstrates how coffee plotter works
	 * Capable of drawing single picture ( for Maker Expo )
	 * @param args
	 */
	public static void main(String[] args) throws Exception, InterruptedException  {
		
		/* 
 		 * Show Loading screen and wait for user reaction
		 * when user presses button, image fades and actual printing starts
		 */
		
		drawGreetings();

		/*
		 * When user presses button, actually starts printing
		 */
		
		/*
		 * Calibration by x-axis should be always in one direction -> backwards
		 * Calibration by y-axis should be always in one direction -> backwards
		 */
		
		while(!Button.ESCAPE.isDown()){
	
			TouchSensor x_home = new TouchSensor(SensorPort.S1);
			TouchSensor y_home = new TouchSensor(SensorPort.S2);
		
			// calibration
			Motor.A.setSpeed(7000);
			while (!x_home.isPressed()) {
				Motor.A.rotate(-300);
				Motor.A.resetTachoCount();
				
			}
	
			Motor.B.setSpeed(7000);
			while (!y_home.isPressed()) {
				Motor.B.rotate(-300);
				Motor.B.resetTachoCount();
			}
			
			/*
			 * In this configuration maximums are:
			 *  - axis X -> 8000 degrees
			 *  - axis Y -> 14000 degrees
			 */
			LCD.drawString("To Start", 4, 0);
			LCD.drawString("press Enter", 3, 1);
			Button.ENTER.waitForPressAndRelease();
			
			// Letter F
			draw.run();
			Motor.A.rotate(8000); // open coffee pipe
			Motor.B.rotate(4000); // open coffee pipe
			Motor.B.rotate(-4000);
		
			Thread.sleep(1000);
			Motor.A.rotate(-4000); // close coffee pipe
			Motor.B.rotate(4000); // open coffee pipe
			Motor.B.rotate(-4000);
			
			Motor.A.rotate(-4000); // close coffee pipe
			
			// move to new letter space
			Motor.B.rotate(5000); // close coffee pipe
			
			Thread.sleep(1000);
			// Letter A
			Motor.A.rotate(8000); // open coffee pipe
			
			Thread.sleep(1000);
			Motor.B.rotate(4000); // open coffee pipe
			Motor.A.rotate(-4000); // close coffee pipe
			Motor.B.rotate(-4000); // close coffee pipe
			
			Thread.sleep(1000);
			Motor.B.rotate(4000); // open coffee pipe
			Motor.A.rotate(4000); // close coffee pipe
			
			Thread.sleep(1000);
			Motor.A.rotate(-8000); // open coffee pipe
			
			// move to new letter space
			Thread.sleep(1000);
			Motor.B.rotate(1000); // open coffee pipe
			
			// Letter B
			Thread.sleep(1000);
			Motor.A.rotate(8000); // open coffee pipe
			Motor.B.rotate(4000); // open coffee pipe
			
			Thread.sleep(1000);
			Motor.A.rotate(-4000, true); // open coffee pipe
			Motor.B.rotate(-4000); // open coffee pipe
			
			Thread.sleep(1000);
			Motor.A.rotate(-4000, true); // open coffee pipe
			Motor.B.rotate(4000); // open coffee pipe
			
			Thread.sleep(1000);
			Motor.B.rotate(-4000); // open coffee pipe
			
			waitExit();
		}
	}
}
