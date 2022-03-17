package com.collection.set;

import java.util.HashSet;
public class ApplicationSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hashset=new HashSet<Student>();
		hashset.add(new Student(1,"A",20));
		hashset.add(new Student(2,"B",22));
		hashset.add(new Student(2,"B",22));
		hashset.add(new Student(3,"C",21));
		for (Student student : hashset) {
			System.out.println(student);
		}
		
	}

}
