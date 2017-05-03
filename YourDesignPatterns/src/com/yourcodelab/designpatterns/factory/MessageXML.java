package com.yourcodelab.designpatterns.factory;

public class MessageXML implements Message{

	@Override
	public String showMessage(String msg) {
		return "<XML><MESSAGE>" + msg + "</MESSAGE></XML>";
	}

}
