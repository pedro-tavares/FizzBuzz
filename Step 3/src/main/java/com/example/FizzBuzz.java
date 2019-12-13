package com.example;

public class FizzBuzz {
	
	private int iFizz, iBuzz, iFizzBuzz, iLucky, iInteger;
	
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
		if (String.valueOf(n).indexOf('3') != -1) {
			iLucky++;
			return "lucky";
		}
		if (n % 15 == 0) {
			iFizzBuzz++;
			return "fizzbuzz";
		} else if (n % 5 == 0) {
			iBuzz++;
			return "buzz";
		}  else if (n % 3 == 0) {
			iFizz++;
			return "fizz";
		}
		iInteger++;
		return Integer.toString(n);
	}

	public int getiFizz() {
		return iFizz;
	}

	public int getiBuzz() {
		return iBuzz;
	}

	public int getiFizzBuzz() {
		return iFizzBuzz;
	}

	public int getiLucky() {
		return iLucky;
	}

	public int getiInteger() {
		return iInteger;
	}
	
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        
        System.out.println(fb.evaluate(args));
        
        System.out.println(
        	"fizz:" + fb.getiFizz() + 
        	" buzz:" + fb.getiBuzz() + 
        	" fizzbuzz:" + fb.getiFizzBuzz() + 
        	" lucky:" + fb.getiLucky() + 
        	" integer:" + fb.getiInteger()
        );
    }

}
