package com.collection.map;

import java.util.*;

public class ApplicationHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedhashmap=new LinkedHashMap<Integer, String>();
		linkedhashmap.put(1,"suresh");
		linkedhashmap.put(2,"sk");
		linkedhashmap.put(3,"sm");
		linkedhashmap.put(4,"vp");
		
//		for (Map.Entry<keyType, valType> entry : map.entrySet()) {
	//		keyType key = entry.getKey();
		//	valType val = entry.getValue();
			
	//	}
		for (int i = 0; i < linkedhashmap.size(); i++) {
			System.out.println(linkedhashmap.get(i));
		}
		
		
	}

}
