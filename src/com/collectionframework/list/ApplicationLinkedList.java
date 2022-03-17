package com.collectionframework.list;

import java.util.*;

public class ApplicationLinkedList {

	public static void main(String[] args) {
		LinkedList<StudentOfLinkedList> linkedlist=new LinkedList<StudentOfLinkedList>();
		linkedlist.add(new StudentOfLinkedList(1,"sk",22));
		linkedlist.add(new StudentOfLinkedList(2,"manoj",21));
		linkedlist.add(new StudentOfLinkedList(3,"ak",19));
		linkedlist.add(new StudentOfLinkedList(4,"sm",22));
		
		System.out.println("1st --------------------------");
		System.out.println(linkedlist);
		
		System.out.println("2nd ---------------------------");
		for (int i = 0; i < linkedlist.size(); i++) {
			System.out.println(linkedlist.get(i));
			
		}
		System.out.println("3rd ---------------------------");
		for (StudentOfLinkedList studentOfLinkedList : linkedlist) {
			System.out.println(studentOfLinkedList);
		}
		System.out.println("4th -----------------------------");
		Iterator<StudentOfLinkedList> iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		System.out.println("5th -----------------------------");
		ListIterator listIterator = linkedlist.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}
		System.out.println("6th ------------------------");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());

		}

	}

}
