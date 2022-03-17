package com.collectionframework.list;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(1, "suresh", 22));
		arraylist.add(new Student(2, "sathish", 25));
		arraylist.add(new Student(3, "sanooj", 21));
		arraylist.add(new Student(4, "thiru", 24));

		System.out.println("1st =============================");
		System.out.println(arraylist);

		System.out.println("2nd ============================");
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println("3rd =============================");
		for (Student student : arraylist) {
			System.out.println(student);
		}
		System.out.println("4th ============================");
		Iterator<Student> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		System.out.println("5th ==============================");
		ListIterator listIterator = arraylist.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}
		System.out.println("6th =========================");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());

		}		
	}

}
