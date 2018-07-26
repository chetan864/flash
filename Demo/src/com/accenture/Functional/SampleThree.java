package com.accenture.Functional;

import java.util.Arrays;
import java.util.List;

public class SampleThree {
	
	public static int doubleIt(int number) {
		try { Thread.sleep(1000);} catch (Exception e) {
			// TODO: handle exception
		}
		return number * 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//referential transparency
		System.out.println(
				
				values.parallelStream()
						.mapToInt(SampleThree::doubleIt)
						.sum()
				//
				);
	}

}
