/**
 * 
 */
package com.promineotech;

/**
 *
 */
public class Week5CodingPrj {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		AsteriskLogger astrskLog = new AsteriskLogger(); 
		astrskLog.log("*LogTesting1231");
		astrskLog.error("*ErrorTesting1231");
		SpacedLogger spcLog = new SpacedLogger();
		spcLog.log("LogTesting1231");
		spcLog.error("ErrorTesting1231");
	}

}
