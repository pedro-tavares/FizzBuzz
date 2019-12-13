package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzBuzz1() {
    	assertEquals(fizzBuzz.evaluate(new String[]{"2", "16"}), "2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16");
    }

    @Test
    public void testFizzBuzz2() {
    	assertEquals(fizzBuzz.evaluate(new String[]{"-3",  "-1"}), "fizz -2 -1");
    }
}
