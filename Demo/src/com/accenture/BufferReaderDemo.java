package com.accenture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		int n;
		System.out.println("Enter a number: ");
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			br.close();
		}
	}

}
