package com.CA.qa.Pages;

public class RevOfArray {

	public static void main(String[] args) {
		int[] original= {1,2,3,4,5};
		
		int[] rev=new int[original.length];
		
		for(int i=original.length-1;i>=0;i--)
			rev[original.length-1-i]=original[i];
		
		for(int i=0;i<rev.length;i++)
			System.out.print(rev[i]+" ");
			
		
		

	}

}
