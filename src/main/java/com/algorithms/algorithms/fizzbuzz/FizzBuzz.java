package com.algorithms.algorithms.fizzbuzz;

public class FizzBuzz {

	public String[] execute(int[] numbers) {
		
		if(numbers == null || numbers.length == 0) return null;
		
		String[] processed = {""};
		
		for(int index = 0; index < numbers.length; index++) {
			
			int number = numbers[index];
			boolean isDividedBy3 = number % 3 == 0; 
			boolean isDividedBy5 = number % 5 == 0;
			
			if(isDividedBy3 && isDividedBy5) {
				processed[index] = "FizzBuzz";
			} else if(isDividedBy3) {
				processed[index] = "Fizz";
			} else if(isDividedBy5) {
				processed[index] = "Buzz";
			} else {
				processed[index] = String.valueOf(number);
			}
		}
		
		return processed;
	}
}
