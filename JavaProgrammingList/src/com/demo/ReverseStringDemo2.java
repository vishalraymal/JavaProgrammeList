package com.demo;

public class ReverseStringDemo2 {
	
	public static void main(String[] args)
	{
		String s="Vishal Raymal";
		StringBuffer str= new StringBuffer();
		str.append(s);
		StringBuffer revStr= str.reverse();
		System.out.println("Reverse String is: "+revStr);
		
		
	}
	
	

}
