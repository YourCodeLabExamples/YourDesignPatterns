package com.yourcodelab.designpatterns.factory;

public class DisplayMessage {
	private Message message;
	
	public DisplayMessage(String type){
		// This code could be improved using a properties file to get the type parameter
		if(type.toUpperCase().equals("XML"))
			message = new MessageXML();
		else if(type.toUpperCase().equals("HTML"))
			message = new MessageHTML();
		else 
			message = new MessageJSON();
	}
	
	public String display(String msg){
		return message.showMessage(msg);
	}
}
