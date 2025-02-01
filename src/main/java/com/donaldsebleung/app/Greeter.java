package com.donaldsebleung.app;

public class Greeter {
	
	public static String greet(String subject) {
		return String.format("Hello %s!", subject);
	}
	
	public static String greet() {
		return greet("World");
	}
}
