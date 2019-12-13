package com.example;

public class FizzBuzz {
	
	public String evaluate(String[] s) {
		StringBuilder sb = new StringBuilder();
		
		for (int i=Integer.parseInt(s[0]); i<=Integer.parseInt(s[1]); i++) {
			sb.append(evaluate(i));
			if (i<Integer.parseInt(s[1])) {
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}
	
	public String evaluate(int n) {
		return n % 15 == 0 ? "fizzbuzz" : n % 5 == 0 ? "buzz" : n % 3 == 0 ? "fizz" : Integer.toString(n);
	}
	
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        
        System.out.println(fb.evaluate(args));
    }
}
