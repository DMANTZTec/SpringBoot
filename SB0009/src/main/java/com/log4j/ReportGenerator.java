package com.log4j;

import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ReportGenerator {
	
	//initializing logger object
	private static Logger logger=Logger.getLogger(ReportGenerator.class);

	public static void main(String[] args) {
/*
		//using basic configuration
		BasicConfigurator.configure();
		
		logger.trace("This is a trace message");
		logger.debug("This is a debug message");
		logger.info("This is a info message");
		logger.warn("This is a warn message");
		logger.error("This is a error message");
		logger.fatal("This is a fatal message");
	}
*/
		PropertyConfigurator.configure(System.getProperty("user.dir")+File.separator+"log4j.properties");
		logger.trace("This is a trace message");
		logger.debug("This is a debug message");
		logger.info("This is a info message");
		logger.warn("This is a warn message");
		logger.error("This is a error message");
		logger.fatal("This is a fatal message");
}
}
