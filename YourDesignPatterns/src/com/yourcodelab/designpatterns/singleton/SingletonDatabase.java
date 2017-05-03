package com.yourcodelab.designpatterns.singleton;

import java.sql.Connection;

public class SingletonDatabase {
	// Self static parameter that will be controlled by the pattern
	private static SingletonDatabase singletonDatabase = null;
	
	// Database connection
	private Connection con;
	
	/**
	 *  Private constructor that is invoked only by the pattern
	 */
	private SingletonDatabase(){
		//Input here the necessary code to open a single database connection
	}
	
	/**
	 *  Method to get the unique singleton instance
	 */
	public static SingletonDatabase getInstance(){
		if(singletonDatabase == null)
			singletonDatabase = new SingletonDatabase(); 
		
		return singletonDatabase;	
	}
}
