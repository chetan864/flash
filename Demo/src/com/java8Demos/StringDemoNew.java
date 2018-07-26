package com.java8Demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringDemoNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = Arrays.asList(5,3,8,2,9);
		
		Stream<Integer> s = values.stream();
		
		s.forEach(System.out::println);
		//s.forEach(System.out::println);
	}

}
