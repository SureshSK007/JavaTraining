package com.collectionframework.list;

import java.util.*;

public class TreeSet01 {

	public static void main(String[] args) {
		TreeSet<Student> treeset=new TreeSet<Student>();
		treeset.add(new Student(1,"sk",22));
		treeset.add(new Student(2,"manoj",21));
		treeset.add(new Student(3,"ak",19));
		treeset.add(new Student(4,"sm",22));
		
		for (Student student : treeset) {
			System.out.println(student);
		}
		Comparator<Student> byId = (o1,o2 ) -> {
			Student student1=(Student) o1;
			Student student2=(Student) o2;
			if (student1.getsId()>student2.getsId()) {
				return 1;
			} else if (student1.getsId()>student2.getsId()){
				return -1;
			}
			return 0;
		};
		TreeSet<Student> treeset1=new TreeSet<Student>(byId);
		treeset1.add(new Student(1,"sk",22));
		treeset1.add(new Student(2,"manoj",21));
		treeset1.add(new Student(3,"ak",19));
		treeset1.add(new Student(4,"sm",22));
		
		System.out.println("After Comparator----------------");
		for (Student student1 : treeset1) {
			System.out.println(student1);
		}
		Comparator<Student> byAge = (o1,o2 ) -> {
			Student student1=(Student) o1;
			Student student2=(Student) o2;
			if (student1.getsAge()<student2.getsAge()) {
				return 1;
			} else if (student1.getsAge()>student2.getsAge()){
				return -1;
			}
			return 0;
		};
		TreeSet<Student> treeset2=new TreeSet<Student>(byAge);
		treeset2.add(new Student(1,"sk",22));
		treeset2.add(new Student(2,"manoj",21));
		treeset2.add(new Student(3,"ak",19));
		treeset2.add(new Student(4,"sm",22));
		
		System.out.println("After Comparator----------------");
		
		for (Student student2 : treeset2) {
			System.out.println(student2);
		}

	}
}
