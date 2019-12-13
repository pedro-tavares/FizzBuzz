package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
    	assertEquals(fizzBuzz.evaluate(new String[]{"2",  "14"}), "2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14");
    }

}
