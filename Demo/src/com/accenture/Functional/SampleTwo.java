package com.accenture.Functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface Selector{
	public boolean pick(int value);
}





public class SampleTwo {
	
	public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
		
		return numbers.stream()
				.filter(selector)
				.reduce(0, Math::addExact);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(totalValues(values, e -> true));
		System.out.println(totalValues(values, e -> e % 2 == 0 ));
	}

}
