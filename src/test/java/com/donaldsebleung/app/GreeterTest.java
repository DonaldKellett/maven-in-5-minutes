package com.donaldsebleung.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for Greeter class
 */
public class GreeterTest {
	
	/**
	 * Greeter should greet world with no arguments.
	 */
	@Test
	public void shouldGreetWorldWithNoArguments() {
		assertEquals("Hello World!", Greeter.greet());
	}
	
	/**
	 * Greeter should greet the subject provided as argument.
	 */
	@Test
	public void shouldGreetSubjectWithArgument() {
		assertEquals("Hello Java!", Greeter.greet("Java"));
		assertEquals("Hello Maven!", Greeter.greet("Maven"));
		assertEquals("Hello Eclipse!", Greeter.greet("Eclipse"));
		assertEquals("Hello Red Hat Enterprise Linux (RHEL) 9!", Greeter.greet("Red Hat Enterprise Linux (RHEL) 9"));
	}
}
