package com.demo;

import java.util.Scanner;

public class ReverseStringDemo3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string :");
		String s= sc.nextLine();
		reverseString(s);		
	}
	static void reverseString(String str)
	{
		String s=str;
		String t="";
		char ch;
		for(int i=0; i < s.length(); i++)
		{
			ch=s.charAt(i);
			t= ch+t;
		}
		System.out.print("Reverse of string :"+t);
		
	}

}
