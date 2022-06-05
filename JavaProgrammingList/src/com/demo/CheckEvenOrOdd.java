package com.demo;

import java.util.Scanner;

public class CheckEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter number: ");
		int num=0;
		boolean inputnumber= true;
		try {
		num =sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
			inputnumber= false;
		}
		if(num>=0 && inputnumber)
		{
			if(num%2==0)
			{
				System.out.println("Its Even Number");
			}
			else
			{
				System.out.println("Its Odd number");
			}
			
		}
		else
		{
			System.out.println("Number is either negative or decimal or both");
		}
	}

}
