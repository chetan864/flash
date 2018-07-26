package com.java8Demos;

interface Fruit {
	
	void show(int i);
}

//class Apple implements Fruit {
//
//	@Override
//	public void show(int i) {
//		// TODO Auto-generated method stub
//		System.out.println("Apple tastes sweet" +i);
//	}
//	
//}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit = i -> System.out.println(i +" Apple tastes sweet  " + i*3);		
		
		fruit.show(6);
	}

}
