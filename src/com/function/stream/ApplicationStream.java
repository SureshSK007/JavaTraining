package com.function.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ApplicationStream {

	public static void main(String[] args) {
		ArrayList<Student> arraylist=new ArrayList<Student>();
		arraylist.add(new Student(1,"suresh",22));
		arraylist.add(new Student(2,"sathish",23));
		arraylist.add(new Student(3,"sannoj",24));
		arraylist.add(new Student(4,"xyz",25));
		arraylist.add(new Student(5,"abc",29));
		
		for (Student student2 : arraylist) {
			System.out.println(student2);
		}
		System.out.println("============================-");
		List<Student> result=new  ArrayList<Student>();
		result=arraylist.stream().filter(student -> student.getsAge()<=25).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("=================================");
		result=arraylist.stream().sorted().collect(Collectors.toList());
		System.out.println("====================================");
		System.out.println(result);
	}

}
