package com.accenture.Functional;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
	}

	private static boolean isPrime(final int number) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> isDivisible = divisor -> number%divisor==0;
		
		return number>1 && 
				IntStream.range(2, number)
						 .noneMatch(index -> number%index == 0);
	}

}
