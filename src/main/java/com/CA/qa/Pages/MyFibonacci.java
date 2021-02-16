package com.CA.qa.Pages;

public class MyFibonacci {
	public int[] febonacci(int count) {
		int[] feb=new int[count];
		feb[0]=0;
		feb[1]=1;
		for (int i=2;i<count;i++)
			feb[i]=feb[i-1]+feb[i-2];
		
//		for(int i=0;i<count;i++)
//		System.out.print(feb[i]+" ");
		return feb;
	}

	public static void main(String[] args) {
		
		MyFibonacci mf=new MyFibonacci();
		int[] feb=mf.febonacci(15);
//		int febCount = 15;
//        int[] feb = new int[febCount];
//        feb[0] = 0;
//        feb[1] = 1;
//        for(int i=2; i < febCount; i++){
//            feb[i] = feb[i-1] + feb[i-2];
//        }
//
//        for(int i=0; i< febCount; i++){
//                System.out.print(feb[i] + " ");
//        }
//   
	}

}
