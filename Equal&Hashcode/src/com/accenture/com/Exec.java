package com.accenture.com;

public class Exec {
	public static void main(String[] args) {
		Student s1 = new Student("H234");
		Student s2 = new Student("H234");
		System.out.println(s2.equals(s1));
	}
}
