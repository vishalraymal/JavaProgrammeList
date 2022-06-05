package com.demo;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean status=true;
		for(int i=2; i <= num-1 ; i++ )
		{
		   if(num%i == 0)
			{
			   status=true;

			}
			else
			{
				status=false;
			}
		
			
		}
	 if(status=true)
		{
			System.out.print("Number is prime: "+num);
			
		}
		else
		{
			System.out.println("Number is not prime :"+num);
		} 

		

	}

}
