package com.CA.qa.TestCases;

import java.util.Arrays;

public class ArrayswithDup3times {

	public static int times3DupInArray(int[] a, int n) {
		if(n<3) {
			System.out.println("invalid array");
		return 0 ;
		}
		int j=0;
		for(int i=0; i<n-2;i++) {
			if(a[i]==a[i+1] && a[i]==a[i+2]) {
				a[j]=a[i];
				j++;
			}
			//9908603021 ram	
		}
	return j;	
	}
	
	
	public static void main(String[] args) {
		int[] a = {10,20,30,40,10,20,40,20,40,50,11,15,15};
		
		Arrays.sort(a);
int len= times3DupInArray(a,a.length);
System.out.print("3 times repeated are: ");
for(int i=0;i<len;i++)
System.out.print(a[i]+ " ");

System.out.println();
System.out.print("total array is: ");
for(int i=0;i<a.length;i++)
System.out.print(a[i]+ " ");

		
	}

}
