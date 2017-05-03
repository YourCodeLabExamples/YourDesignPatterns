package com.yourcodelab.designpatterns.test;

import com.yourcodelab.designpatterns.factory.DisplayMessage;

public class FactoryTest {

	public static void main(String[] args) {
		DisplayMessage displayMessage = new DisplayMessage("XML");
		System.out.println("Message: " + displayMessage.display("Success"));
	}

}
