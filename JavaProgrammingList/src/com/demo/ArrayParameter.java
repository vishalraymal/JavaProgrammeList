package com.demo;

public class ArrayParameter {
		
		String name[]= new String[3];   // 3= length parameter and index should start from 0 [0][1][2]
		
		public void setData(String arr[])
		{
			for(int i=0; i< arr.length;i++)
			{
				name[i]=arr[i];
			}			
		}
		
		
		public void displayData()
		{
			for(int i=0; i< name.length;i++)
			{
				System.out.println(name[i]);
			}
		}
		
		
		public static void main(String[] args)
		{
			String n[]= {"Vishal","Pavan","Shital"};
			
			ArrayParameter obj = new ArrayParameter();
			obj.setData(n);
			obj.displayData();
		}
		
}
