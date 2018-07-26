package com.accenture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.activation.MimetypesFileTypeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> myMap = new HashMap<>();
		myMap.put("name", "chetan");
		myMap.put("actor", "vijay");
		myMap.put("food","salad");
		
		Set<String> keys = myMap.keySet();
		
		for(String key : keys) {
			System.out.println(key+ " : " +myMap.get(key));
		}
		
	}

}
