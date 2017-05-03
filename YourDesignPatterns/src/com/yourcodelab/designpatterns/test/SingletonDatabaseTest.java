package com.yourcodelab.designpatterns.test;

import com.yourcodelab.designpatterns.singleton.SingletonDatabase;

public class SingletonDatabaseTest {

	public static void main(String[] args) {
		// Invoke the singleton pattern 2 twice
		SingletonDatabase single01 = SingletonDatabase.getInstance();
		SingletonDatabase single02 = SingletonDatabase.getInstance();
		
		// Showing their memory addresses.. must be the same
		System.out.println("Singleton 01 Memory Address = " + single01);
		System.out.println("Singleton 02 Memory Address = " + single02);

	}

}
