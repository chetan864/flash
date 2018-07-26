package com.accenture;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> sint = new TreeSet<>();
		System.out.println(sint.add(87));
		sint.add(97);
		sint.add(34);
		sint.add(6);
		System.out.println(sint.add(6));
		
		
		for(int i: sint) {
			System.out.println(i);
		}
	}

}
