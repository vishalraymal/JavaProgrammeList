package com.demo;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year= sc.nextInt();
		LeapYear obj= new LeapYear();
		obj.isLeapYear(year);
	}
	void isLeapYear(int year)
	{
		boolean leap= false;
		int n= year;
		if(n> 1582) {  // leap year introduced in 1582, reflink: https://www.mathsisfun.com/leap-years.html
			if(n%4==0) {
				if(n%100==0) {
					if(n%400==0)
					{
						leap=true;
					}
					else
					{
						leap=false;
					}
					
				}
				else {
					leap = true;

				}
				
			}
		}
		else
		{
			System.out.println("YEAR VALUE ENTERED NEGATIVE OR ZERO");
		}
		if(leap)
		{
			System.out.println(n+" Entered is leap year");
		}
		else
		{
			System.out.println(n+" Entered is not leap year");

		}
	}
	
	
}
