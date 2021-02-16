package com.CA.qa.Pages;

import java.util.ArrayList;

public class DupOf1toN {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		int N=20;
		for(int i=1;i<=N;i++)
			li.add(i);
		li.add(12);
		
		int total=N*(N+1)/2;
		int sum=0;
		
		for(int i:li)
			sum=sum+i;
		System.out.println("duplicate int is:  "+(sum-total));

	}

}
