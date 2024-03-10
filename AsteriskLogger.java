package com.promineotech;

public class AsteriskLogger implements Logger {

	  public void log(String logMsg) {

	    // The body of log() is provided here

	    System.out.println("***"+logMsg+"***");

	  }

	  public void error(String errMsg) 
	  {

		    // The body of error() is provided here

		  System.out.println("*****************");

		  System.out.println("***"+errMsg+"***");

		  System.out.println("*****************");

	  }

}




	

		

