package com.CA.qa.TestCases;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ArraydupwithHashmap {
	
	private static void findDuplicatesUsingHashMap(int[] inputArray){
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	         
	    for (int element : inputArray) 
	    {   
	        if(map.get(element) == null)
	        {
	            map.put(element, 1);
	        }
	        else
	        {
	            map.put(element, map.get(element)+1);
	        }
	    }
	         
	    Set<Entry<Integer, Integer>> entrySet = map.entrySet();
	         
	    for (Entry<Integer, Integer> entry : entrySet) 
	    {               
	        if(entry.getValue() == 3)
	            System.out.print(entry.getKey()+ " ");
	        	//System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
	    }
	}
	
	public static void main(String[] args) {
		int[] a = {10,20,30,40,10,20,40,20,40,50,11,15,15};
		findDuplicatesUsingHashMap(a);
	}
}

