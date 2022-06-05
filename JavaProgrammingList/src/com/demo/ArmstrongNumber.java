package com.demo;

import javax.print.attribute.standard.OrientationRequested;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orginal_num=281;
		int n = orginal_num;
		int temp=0;
		// Using while loop
		while(n>0)
		{
			int r= n%10;
			temp= temp+(r*r*r);
			n=n/10;
		} 
	
		
		
		if(temp==orginal_num)
		{
			System.out.println(orginal_num+ " is Armstrong Number");
		}
		else
		{
			System.out.println(orginal_num+ " is not Armstrong Number");
		}

	}

}
