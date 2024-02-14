package com.test;

import java.util.HashMap;

public class PrintWordFrequencyCount {
	
	public static void main(String[] args) {
		
		
		String str="Hello How are  hello you ?";
		
		String[] st = str.split(" ");
		
		HashMap<String ,Integer> hm=new HashMap<>();
		
		
		for(int i=0; i<st.length; i++) {
			
			
			if(hm.containsKey(st[i])) {
				
				
				hm.put(st[i],hm.get(st[i])+1);
				
			}else {
				
				
				hm.put(st[i], 1);
				
			}
			
			
		}
		System.out.println(hm);
	}

}
