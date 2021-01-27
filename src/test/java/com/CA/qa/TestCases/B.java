package com.CA.qa.TestCases;

public class B extends A
{
    public B()
    {
    	
        System.out.println("B const");

    }
    
    public void display(){
    	System.out.println("B display");
    }

    

public static void main(String[] args)
    {
         A a  = (B) new B();// what is use of it?
         a.display();
        //obj.method1();
        //Console.Read();
    }
   
}