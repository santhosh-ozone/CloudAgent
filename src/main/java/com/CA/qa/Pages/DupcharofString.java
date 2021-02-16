package com.CA.qa.Pages;

import java.util.HashMap;
import java.util.Set;

public class DupcharofString {
	
	public void dupchar(String str) {
		
		char[] chars=str.toCharArray();
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(char ch:chars)
			if(map.get(ch)==null)
				map.put(ch, 1);
			else
				map.put(ch, map.get(ch)+1);
		
		Set<Character> keys=map.keySet();
		
		for(char key:keys)
//			if(map.get(key)>1)
//				System.out.println(key+" repeated "+map.get(key)+" times");
			System.out.println(key+"  "+map.get(key)+" times");
	}

	public static void main(String[] args) {
		
		DupcharofString dcs=new DupcharofString();
		dcs.dupchar("selenium");
	}

}
