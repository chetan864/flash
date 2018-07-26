package com.accenture.Functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SampleOne {
	
	public static boolean isGreaterThan3(int number) {
		System.out.println("isGreater3 " + number);
		return number > 3;
		
	}
	
	public static boolean isEven(int number) {
		System.out.println("isEven " +number);
		return number % 2 == 0;
		
	}
	
	public static int doubleIt(int number) {
		System.out.println("isDouble "+number);
		return number * 2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find the double of the first even greater than 3
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Predicate<Integer> isGreaterThan3 = number -> number > 3 ;
		
		Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot ;
		
		final Stream<Integer> temp = values.stream()
				//.filter(e -> isGreaterThan3(e))
				//.filter(isGreaterThan3)
				.filter(isGreaterThan.apply(3)) //dependency injection happening here , which is a glamourous way of strategy pattern
				.filter(SampleOne::isEven)
				.map(SampleOne::doubleIt );
		System.out.println(
				
					temp.findFirst()
					.get()	
				);
		
//		System.out.println(
//				values.stream()
//					.filter(e -> e > 3)
//					.filter(e -> e % 2 == 0)
//					.map(e -> e * 2 )
//					.findFirst()
//					.get()	
//				);
		
	}

}
