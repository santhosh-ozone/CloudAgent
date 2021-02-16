package com.CA.qa.Pages;

public class NumberReverse {

    public int reverseNumber(int number){
        
        int reverse = 0;
        for(;number!=0;number=number/10)
        	reverse = (reverse*10)+(number%10);
//        while(number != 0){
//            reverse = (reverse*10)+(number%10);
//            number = number/10;
//        } 
        return reverse;
    }
     

	public static void main(String[] args) {
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.reverseNumber(17868));


	}

}
