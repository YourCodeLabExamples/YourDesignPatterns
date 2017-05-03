package com.yourcodelab.designpatterns.factory;

public class MessageJSON implements Message{

	@Override
	public String showMessage(String msg) {
		return "<HTML><BODY><H1>" + msg + "</H1></BODY></HTML>";
	}

}
