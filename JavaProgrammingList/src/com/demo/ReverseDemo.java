package com.demo;

public class ReverseDemo {
	
	public static void main(String[] args) {
		String s= "MADAM";
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t = t+s.charAt(i);
		}
		if(t.equals(s))
		{
			System.out.println("Reverse String is palindrome : "+ t);
		}
		else
		{
			System.out.println("Reverse string is not palindrome : "+ t);
		}
	}

}
