package com.demo;
import java.util.Scanner;

public class CountNumberOfDigit {
	public static void main(String arg[])
	{
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num= src.nextInt();
		int countNumber=0;
		while(num>0)
		{
			num=num/10; 
			countNumber++;
		}
		System.out.println("Count Number of Digit is : "+ countNumber);
	}

}
