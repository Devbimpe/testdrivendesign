package com.bimpe.tdd;

import org.junit.Test;

import org.junit.Assert;

public class FizzBuzzTest {
	@Test
	public void fizzBuzzPrintNumber() {
		FizBuzzConverter fizBuzzConverter = new FizBuzzConverter();
		Assert.assertEquals("1", fizBuzzConverter.convert(1));
		Assert.assertEquals("2", fizBuzzConverter.convert(2));
		
	}
	
	@Test
	public void fizzBuzzMultipleOfThree() {
		FizBuzzConverter fizBuzzConverter = new FizBuzzConverter();
		Assert.assertEquals("Fizz", fizBuzzConverter.convert(3));
		
	}
	
	@Test
	public void fizzBuzzMultipleOfFive() {
		FizBuzzConverter fizBuzzConverter = new FizBuzzConverter();
		Assert.assertEquals("Buzz", fizBuzzConverter.convert(5));
	}
	
	@Test
	public void fizzBuzzMultipleOfFiveAndThree() {
		FizBuzzConverter fizBuzzConverter = new FizBuzzConverter();
		Assert.assertEquals("FizzBuzz", fizBuzzConverter.convert(15));
	}


}
