package com.accenture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
	
	int age;
	int marks;
	String name;
	
	public Stud(int age, int marks, String name) {
		super();
		this.age = age;
		this.marks = marks;
		this.name = name ;
	}

	@Override
	public String toString() {
		return "Stud [age=" + age + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Stud s) {
		// TODO Auto-generated method stub
		return marks>s.marks?1:-1;
	}
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23, 55, "Mahesh"));
		studs.add(new Stud(24, 64, "Sony"));
		studs.add(new Stud(25, 25, "Larry"));
		studs.add(new Stud(26, 36, "Joseph"));
		
		Collections.sort(studs, (i,j) ->  i.age > j.age?1:-1);;
		
		for(Stud s: studs) {
			System.out.println(s);
		}
	}

}
