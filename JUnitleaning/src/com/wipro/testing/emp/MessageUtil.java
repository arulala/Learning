package com.wipro.testing.emp;

public class MessageUtil {

	private String message;

	// Constructor
	// @param message to be printed
	public MessageUtil(String message) {
		this.message = message;
	}

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public String salutationMessage(){
		message = "Salute "+ message;
		System.out.println(message);
		return message;
	}
}
