package com.exception;

public class ExceptionExampleProgram {
	public static void m1() throws InterruptedException{
		Thread.sleep(1000);
	}
	public static void m2() throws InterruptedException{
		m1();
	}
	public static void m3() throws InterruptedException{
		m2();
	}
	private static void m4() throws InterruptedException{
		m3();
	}

	public static void main(String[] args) {
		System.out.println("Started...");
		try {
			m4();
			
		} catch (Exception e) {
			System.out.println("this is an sleep");
		}
		System.out.println("Stoped...");

	}

}
