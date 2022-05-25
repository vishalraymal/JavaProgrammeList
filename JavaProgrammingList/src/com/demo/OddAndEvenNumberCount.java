package com.demo;
import java.util.Scanner;

public class OddAndEvenNumberCount {
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Enter the number :");
		int org_num =src.nextInt();
		int num=0;
		int odd_no=0, even_no=0;
		while(org_num>0)
		{
			num= org_num%10; 
			org_num=org_num/10;
			if(num%2==0)
			{
				even_no++;
			}
			else
			{
				odd_no++;
			}
			
		}
		System.out.println("The total of even number count is : "+ even_no);
		System.out.println("The total of odd number count is : "+odd_no);
		
		
		
	}

}
