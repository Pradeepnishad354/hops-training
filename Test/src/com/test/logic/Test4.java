package com.test.logic;

import java.util.HashMap;
import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentences ");
		String str = sc.nextLine();
		
		char[] sp = str.toCharArray();
		
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
	for(int i=0; i<sp.length; i++) {
		
		
		
		if(map.containsKey(sp[i])) {
			
			map.put(sp[i], map.get(sp[i])+1);
		}else {
			
			map.put(sp[i], 1);
		}
		
	}
		System.out.println(map);
	}

	
	
}
