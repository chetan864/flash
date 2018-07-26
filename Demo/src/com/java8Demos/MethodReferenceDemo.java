package com.java8Demos;

interface Parser {
	
	String parse(String mystr);
}

class StringParser{
	
	public String Converter(String s) {
		if(s.length()<3) {
			s = s.toUpperCase();
		}else {
			s = s.toLowerCase();
		}
		
		return s;
		
	}
}


class MyPrinter{
	
	public void print(String str, Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
	
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "ch";
		MyPrinter mp = new MyPrinter();
		StringParser sp = new StringParser();
		mp.print(name, (sp::Converter));
	}

}
