package com.jiangjg.lib.EffectiveJava;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;


class LoggingException extends Exception{
	private static Logger logger = Logger.getLogger("LoggingException");
	
	public LoggingException(){
		StringWriter trace = new StringWriter();
		printStackTrace();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class LoggingExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
