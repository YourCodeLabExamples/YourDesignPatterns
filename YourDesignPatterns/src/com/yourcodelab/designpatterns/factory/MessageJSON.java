package com.yourcodelab.designpatterns.factory;

public class MessageJSON implements Message{

	@Override
	public String showMessage(String msg) {
		return "{message:{content:'" + msg + "'}}";
	}

}
