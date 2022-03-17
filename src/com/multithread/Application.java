package com.multithread;

public class Application {

	public static void main(String[] args) {
		System.out.println("Thread Started");
		MyExampleThread md=new MyExampleThread();
		Example2 e2=new Example2();
		
		md.start();
		e2.start();
	}

}
