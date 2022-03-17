package com.function.Predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i ->{
			if(i%2==0)
				return true; 
			return false;
		};
		int num=10;
		System.out.println("Is even?"+predicate.test(num));
		
		Predicate<String> predicate2= i ->{
			if(i.length()<=5)
				return true;
			return false;
		};
		String str="helloty";
		System.out.println("is correct>"+predicate2.test(str));
	}

}
