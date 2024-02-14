package com.test.lambda;

interface Messageble {

	Message getMsg(String str);
}


class Message {

	Message(String msg) {

		System.out.println(msg);

	}

}

public class ConstructorReference {

	public static void main(String[] args) {
		
		Messageble msg=Message::new;
		
		msg.getMsg("Hello");
	}

}
