package com.algorithms.algorithms.fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import org.junit.Assert;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() {
		fizzBuzz = Mockito.spy(new FizzBuzz());
	}
	
	@Test
	public void shouldReturnNullWhenParameterIsEmpty() {
		int[] numbers = {};
		String[] fizz = fizzBuzz.execute(numbers);
		Assert.assertNull(fizz);
	}
	
	@Test
	public void shouldReturnFizzWhenNumberIsDividedBy3() {
		int[] numbers = {3};
		String[] fizz = fizzBuzz.execute(numbers);
		Assert.assertEquals("Fizz", fizz[0]);
	}
	
	@Test
	public void shouldReturnFizzWhenNumberIsDividedBy5() {
		int[] numbers = {5};
		String[] fizz = fizzBuzz.execute(numbers);
		Assert.assertEquals("Buzz", fizz[0]);
	}
	
	@Test
	public void shouldReturnFizzBuzzWhenNumberIsDividedBy3And5() {
		int[] numbers = {15};
		String[] fizz = fizzBuzz.execute(numbers);
		Assert.assertEquals("FizzBuzz", fizz[0]);
	}
	
	@Test
	public void shouldReturnOneWhenNumberIsntDividedBy3And5() {
		int[] numbers = {1};
		String[] fizz = fizzBuzz.execute(numbers);
		Assert.assertEquals("1", fizz[0]);
	}
}
