package com.suls.owen;

import java.util.HashMap;

public class DataStructures {
	
	public String hashMapExample() {
	
		HashMap<String, String> kids = new HashMap<String, String>();
		
		kids.put("first", "Emma");
		kids.put("second", "Cian");
		kids.put("third", "Caoimhe");
		
		for (String kid : kids.keySet()) {
			System.out.println(kid + ": " + kids.get(kid));
		}
		
		return(kids.get("first"));
	}
}
