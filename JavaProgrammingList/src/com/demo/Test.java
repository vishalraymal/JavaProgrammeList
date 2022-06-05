package com.demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int n = sc.nextInt();
		// boolean leap=false;
		if (n > 1852) 
		{
			if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
			{
				System.out.println(n+" IS LEAP YEAR");
			} else {
				System.out.println(n+ " IS NOT LEAP YEAR");
			}

		} 
		else 
		{
			System.out.println("INVALID ENTRY, PLEASE ENTER AFTER 1852 ANY VALID YEAR..");
		}

	}

}
