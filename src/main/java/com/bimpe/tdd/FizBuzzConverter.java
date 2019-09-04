package com.bimpe.tdd;

import java.util.stream.IntStream;

public class FizBuzzConverter {

	public static String convert(int numberToConvert) {
		// TODO Auto-generated method stub
		if(numberToConvert%15 == 0) {
			return "FizzBuzz";
		}
		if(numberToConvert%3 == 0) {
			return "Fizz";
		}
		if(numberToConvert%5 == 0) {
			return "Buzz";
		}
		else {
		return String.valueOf(numberToConvert);
		}
	}
	
	public static void fizzBuzzApp() {
		IntStream.rangeClosed(1, 100).forEach(i -> System.out.println(convert(i)));
		
	}

}
