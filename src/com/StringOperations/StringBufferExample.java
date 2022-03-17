package com.StringOperations;

public class StringBufferExample {
	public static void main(String[] args) {
	StringBuffer sf=new StringBuffer("Welcome");
	StringBuffer sf2=new StringBuffer("Somethink!");
	sf.append("To Bangalore");
	System.out.println(sf.capacity()); // string capacity
	System.out.println(" ");
	System.out.println(sf);
	sf.insert(1,"java");
	System.out.println(" ");
	System.out.println(sf);
	sf.replace(1,3,"Python");
	System.out.println(" ");
	System.out.println(sf);
	sf.delete(1,3);
	System.out.println(" ");
	System.out.println(sf);
	
	System.out.println(" ");
	
	sf2.reverse();
	System.out.println(sf2);
	
	System.out.println(sf.capacity());
	
	
	}

}
