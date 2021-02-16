package com.CA.qa.Pages;

import java.util.HashMap;
import java.util.Set;

public class DupwordsofLine {

	public static void main(String[] args) {
		String str="Write a java program to find the duplicate words and the number of occurrences in the string?";
		String[] str1=str.split(" ");
		
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		for(String s:str1)
			if(map.get(s)==null)
				map.put(s, 1);
				else
					map.put(s, map.get(s)+1);
					
		Set<String> keys=map.keySet();
		for(String key : keys)
			if(map.get(key)>1)
				System.out.println("word: "+key+" :occurrences are : "+map.get(key));
			

	}

}
