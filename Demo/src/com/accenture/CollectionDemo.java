package com.accenture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
		Collections.sort(values, (o1,o2) ->  o1%10 > o2%10?1:-1);
		
		
		
		for(Integer o: values) {
			System.out.println(o);
		}

	}

}
