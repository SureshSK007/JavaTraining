package com.multithread;

public class Example2 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("thread");
		}
		
	}

}
