package com.oops.abstraction;

public class App24 {

	public static void main(String[] args) {
		AbstractionExample android=new Miui();//upcasting
		android.runOs();
		android.powerOn();
	}

}
