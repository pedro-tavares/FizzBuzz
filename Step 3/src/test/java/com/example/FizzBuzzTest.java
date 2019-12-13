package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
    	assertEquals(fizzBuzz.evaluate(new String[]{"1", "20"}), "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz");
    	
    	assertEquals(fizzBuzz.getiFizz(), 4);
    	assertEquals(fizzBuzz.getiBuzz(), 3);
    	assertEquals(fizzBuzz.getiFizzBuzz(), 1);
    	assertEquals(fizzBuzz.getiLucky(), 2);
    	assertEquals(fizzBuzz.getiInteger(), 10);
    }

}
