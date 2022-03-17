package com.function.Predicate;

import java.util.function.Function;



public class ApplicationFunctionApply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> function = i -> i * i;
		
		System.out.println("Square"+function.apply(10));
		
		
		Function<String, Boolean> function1 = s ->{
			String rev="";
			for (int j = 0; j < s.length(); j++) {
				rev= rev + s.charAt(j);
				
			}
			if(s.equals(rev))
				return true;
			return false;
			
		};  
	//	String str="tenet";
		System.out.println("palindrome is ?"+function1.apply("dsklfje"));
		
		
		
		
		
	}

}
