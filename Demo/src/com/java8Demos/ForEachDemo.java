package com.java8Demos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class ConsumImplement implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(5,6,7);
		
		//Consumer<Integer> consum ; 
		
		list.forEach(t->  System.out.println(t));
		
		
		//System.out.println("internal loops - java8 ");
		//list.forEach(k -> System.out.println(k));
		
	}

}
