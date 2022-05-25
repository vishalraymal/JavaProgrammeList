package com.demo;
import java.util.Scanner;

public class CountOddAndEvenNumberSum {
	
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Enter the valid numeric number :");
		int org_num= src.nextInt();
		int num=0,even_no=0,odd_no=0;
		while(org_num>0)
		{
			 num= org_num%10;
			 org_num= org_num/10;
			 if(num%2==0)
			 {
				 even_no= even_no+num;
			 }
			 else
			 {
				 odd_no=odd_no+num;
			 }
		}
		
		System.out.println("The total number count of even number :"+ even_no);
		System.out.println("The total number count of even number :"+ odd_no);
	}
}
