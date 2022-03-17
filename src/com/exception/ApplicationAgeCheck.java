package com.exception;

import java.util.*;

public class ApplicationAgeCheck {

	public static void main(String[] args) throws AgeCheckException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if(age<0) {
			String str = null;
			throw new AgeCheckException(str);
		}
		System.out.println("Age is"+age);

	}

}
