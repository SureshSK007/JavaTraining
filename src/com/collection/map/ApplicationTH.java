package com.collection.map;

import java.util.*;

public class ApplicationTH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Student> treemap = new TreeMap<Integer, Student>();
		treemap.put(1, new Student(1, "suresh", 22));
		treemap.put(2, new Student(2, "sk", 23));
		treemap.put(3, new Student(3, "sm", 22));

		for (Map.Entry<Integer, Student> entry : treemap.entrySet()) {
			System.out.println("key " + entry.getKey() + entry.getValue());

		}
		
		Comparator cmpString = {
			
		};
		
		TreeMap<Integer, Student> treemap1 = new TreeMap<Integer, Student>();
		treemap1.put(1, new Student(1, "suresh", 22));
		treemap1.put(2, new Student(2, "sk", 23));
		treemap1.put(3, new Student(3, "sm", 22));
	}

}
