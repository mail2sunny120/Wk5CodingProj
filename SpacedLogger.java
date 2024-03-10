package com.promineotech;

public class SpacedLogger implements Logger {

	  public void log(String logMsg) {

	    // The body of log() is provided here

	    StringBuilder sb = new StringBuilder(logMsg);

	    for (int i=1; i<sb.length(); i+=2)

	        sb.insert(i, ' ');

	    System.out.println(sb.toString());			    

	  }

	  public void error(String errMsg) {

		    // The body of error() is provided here

		    StringBuilder sb = new StringBuilder(errMsg);

		    for (int i=1; i<sb.length(); i+=2)

		        sb.insert(i, ' ');

		    System.out.println("ERROR: "+sb.toString());			    

	  }

	  

}
