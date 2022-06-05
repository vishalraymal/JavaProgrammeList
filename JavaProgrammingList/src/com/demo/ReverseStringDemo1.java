package com.demo;

public class ReverseStringDemo1 {

	public static void main(String[] args) {
		String str = "MADAM";
		String t = "";
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			t = t + str.charAt(i);
		}
		System.out.println("Reverse String is: " + t);

	}
}