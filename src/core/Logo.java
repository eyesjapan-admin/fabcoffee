package core;

/**
 * Class to store static xbm logo images
 * @author Denis Vazhenin
 * @author Frederik Schlupkothen
 */

class Logo {
	private byte[] fabcoffee;

	/**
	 * Create object with default xbm byte array for the FabCoffee logo
	 */
	public Logo() {
		//byte[] fab_logo = new byte[]
		this.fabcoffee	= new byte[]{
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x80, (byte) 0x03, (byte) 0x1E, (byte) 0x00, (byte) 0x8F, (byte) 0x07,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0xFE, (byte) 0x80, (byte) 0x83, (byte) 0x3F, (byte) 0x80, (byte) 0xCF,
			(byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0xFC, (byte) 0x3E, (byte) 0xBF, (byte) 0xFF, (byte) 0xCF,
			(byte) 0xE7, (byte) 0xF3, (byte) 0xF3, (byte) 0x01, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0xFC, (byte) 0x3E, (byte) 0xBF, (byte) 0xF1,
			(byte) 0xDF, (byte) 0xE7, (byte) 0xF3, (byte) 0xFB, (byte) 0x03, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x3C, (byte) 0x3E, (byte) 0xB7,
			(byte) 0xC1, (byte) 0x9D, (byte) 0xC1, (byte) 0xF8, (byte) 0xFB, (byte) 0x03,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x3C, (byte) 0x3F,
			(byte) 0xF7, (byte) 0xC3, (byte) 0x9C, (byte) 0xC1, (byte) 0xF8, (byte) 0xFB,
			(byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x1E,
			(byte) 0xFF, (byte) 0xBF, (byte) 0xFF, (byte) 0xDF, (byte) 0xE7, (byte) 0xF3,
			(byte) 0xFB, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x1E, (byte) 0xFF, (byte) 0xBF, (byte) 0xFF, (byte) 0xCF, (byte) 0xE7,
			(byte) 0xF3, (byte) 0xFB, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x0C, (byte) 0x0C, (byte) 0x0E, (byte) 0x03,
			(byte) 0x00, (byte) 0xC0, (byte) 0x40, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x98, (byte) 0x9F, (byte) 0x3E, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xE6, (byte) 0x7F, (byte) 0x61,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xF1, (byte) 0xFF,
			(byte) 0x9C, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xC0, (byte) 0xFC,
			(byte) 0xFF, (byte) 0x3F, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x30,
			(byte) 0xFF, (byte) 0xFF, (byte) 0x7F, (byte) 0x01, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0xCC, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x02, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0xF6, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x02,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0xFA, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
			(byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFD, (byte) 0x7F, (byte) 0xC0,
			(byte) 0xFF, (byte) 0x05, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0xFC, (byte) 0xFF,
			(byte) 0xFE, (byte) 0xFE, (byte) 0x09, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0xFE,
			(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x0B, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80,
			(byte) 0xFE, (byte) 0xFD, (byte) 0xFF, (byte) 0xFF, (byte) 0x1B, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0xC0, (byte) 0xFE, (byte) 0xFE, (byte) 0xFF, (byte) 0xFF, (byte) 0x37,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x20, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
			(byte) 0x4F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0xD0, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
			(byte) 0xFF, (byte) 0xBF, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xE8, (byte) 0xFF, (byte) 0xFF,
			(byte) 0xFF, (byte) 0xFF, (byte) 0x7F, (byte) 0x01, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xF4, (byte) 0xFF,
			(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFD, (byte) 0x02, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFA,
			(byte) 0xF9, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFD, (byte) 0x05,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0xF9, (byte) 0xFE, (byte) 0x7F, (byte) 0xF0, (byte) 0xFF, (byte) 0xFF,
			(byte) 0x09, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x7D, (byte) 0xFB, (byte) 0x07, (byte) 0xFB, (byte) 0xFF,
			(byte) 0xFF, (byte) 0x0B, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0xBE, (byte) 0xFD, (byte) 0xFD, (byte) 0x72,
			(byte) 0xFC, (byte) 0xDF, (byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xBE, (byte) 0xFD, (byte) 0x7F,
			(byte) 0x77, (byte) 0xFF, (byte) 0xB3, (byte) 0x07, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x5F, (byte) 0xFD,
			(byte) 0xFF, (byte) 0xF0, (byte) 0xFF, (byte) 0xB4, (byte) 0x0F, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x4F,
			(byte) 0xF9, (byte) 0xFF, (byte) 0xFF, (byte) 0x9F, (byte) 0x3B, (byte) 0x0F,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x2F, (byte) 0x9D, (byte) 0xFF, (byte) 0xFF, (byte) 0xCF, (byte) 0x3F,
			(byte) 0x0F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x2F, (byte) 0x5D, (byte) 0xFF, (byte) 0xFF, (byte) 0xD1,
			(byte) 0x3F, (byte) 0x0F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0xA7, (byte) 0xCC, (byte) 0xFC, (byte) 0x7F,
			(byte) 0xDC, (byte) 0x5F, (byte) 0x0E, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xA7, (byte) 0x0C, (byte) 0x03,
			(byte) 0x8F, (byte) 0xCB, (byte) 0x2F, (byte) 0x0E, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xA7, (byte) 0x7D,
			(byte) 0x3D, (byte) 0x30, (byte) 0xC8, (byte) 0x33, (byte) 0x0E, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x17,
			(byte) 0xFD, (byte) 0xC2, (byte) 0x1F, (byte) 0xF4, (byte) 0x4F, (byte) 0x0E,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x37, (byte) 0xFD, (byte) 0x05, (byte) 0x00, (byte) 0xFA, (byte) 0xBF,
			(byte) 0x0E, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x2F, (byte) 0xFA, (byte) 0x1B, (byte) 0x80, (byte) 0xFD,
			(byte) 0xBF, (byte) 0x0E, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x2F, (byte) 0xFA, (byte) 0xE7, (byte) 0x7F,
			(byte) 0xFE, (byte) 0x3F, (byte) 0x0F, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x2F, (byte) 0xF4, (byte) 0x1F,
			(byte) 0x00, (byte) 0xFF, (byte) 0x4F, (byte) 0x0F, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x5F, (byte) 0xE8,
			(byte) 0x7F, (byte) 0xE0, (byte) 0xFF, (byte) 0x30, (byte) 0x0F, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xDF,
			(byte) 0xC8, (byte) 0xFF, (byte) 0xFF, (byte) 0x7F, (byte) 0xAF, (byte) 0x0F,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0xBF, (byte) 0xB0, (byte) 0xFF, (byte) 0xFF, (byte) 0xBF, (byte) 0xD0,
			(byte) 0x0F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x7F, (byte) 0x61, (byte) 0xFE, (byte) 0xFF, (byte) 0x4F,
			(byte) 0xE8, (byte) 0x0F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x7E, (byte) 0x86, (byte) 0xFC, (byte) 0xFF,
			(byte) 0x23, (byte) 0xF6, (byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFD, (byte) 0x09, (byte) 0xF3,
			(byte) 0xFF, (byte) 0x18, (byte) 0xFB, (byte) 0x0B, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFA, (byte) 0x33,
			(byte) 0x0C, (byte) 0x00, (byte) 0xC7, (byte) 0xFC, (byte) 0x05, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xF2,
			(byte) 0xCF, (byte) 0xF9, (byte) 0xFF, (byte) 0x39, (byte) 0xFF, (byte) 0x06,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0xE4, (byte) 0x3F, (byte) 0x3E, (byte) 0xC6, (byte) 0xC7, (byte) 0x7F,
			(byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0xC8, (byte) 0xFF, (byte) 0xF0, (byte) 0xFF, (byte) 0xF0,
			(byte) 0x9F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x30, (byte) 0xFF, (byte) 0x0F, (byte) 0x00,
			(byte) 0xFF, (byte) 0x4F, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x40, (byte) 0xFE, (byte) 0xFF,
			(byte) 0xFF, (byte) 0xFF, (byte) 0x37, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0xF9,
			(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x19, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0xC6, (byte) 0xFF, (byte) 0xFF, (byte) 0x7F, (byte) 0x06, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x18, (byte) 0xFE, (byte) 0xFF, (byte) 0x87, (byte) 0x01,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00
		};
	} //Constructor 

	/**
	 * GET method for the Fabcoffee logo
	 * @return fabcoffee logo xbm array
	 */
	
	public byte[] getFabcoffeeLogo(){
		return this.fabcoffee;
	}
} // Logo
