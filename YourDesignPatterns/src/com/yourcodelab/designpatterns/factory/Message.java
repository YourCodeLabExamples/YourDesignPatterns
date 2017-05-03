package com.yourcodelab.designpatterns.factory;

public interface Message {
	/**
	 * Method to return a encapsulated message to another application
	 * @param msg
	 * @return
	 */
	public String showMessage(String msg);
}
