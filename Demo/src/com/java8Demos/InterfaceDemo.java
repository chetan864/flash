package com.java8Demos;

interface Phone {
	
	void call();
	
	default void message() {
		System.out.println("SMS sent");
	}
	
	static void voiceMail() {
		System.out.println("voice mail recorded and sent");
	}
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call a phone number to speak");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new AndroidPhone();
		phone.call();
		phone.message();
		Phone.voiceMail();
	}

}
