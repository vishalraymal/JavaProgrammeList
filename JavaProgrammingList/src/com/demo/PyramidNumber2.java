package com.demo;

public class PyramidNumber2 {

	public static void main(String[] args) {

		int k=0;
		for(int i=4 ; i > 0; i--)
		{
			for(int j=0 ; j <= 4-i ; j++)
			{
				k++;
				System.out.print(k+ "  ");
			}
			System.out.println();
		}

		
		
	}

}
