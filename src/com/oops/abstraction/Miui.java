package com.oops.abstraction;

public class Miui extends AbstractionExample{

	@Override
	public void runOs() {
		System.out.println("runOs()");
		
	}

	@Override
	public void security() {
		System.out.println("security");
		
	}

	@Override
	public void openOs() {
		System.out.println("openOs()");
		
	}
	@Override
	public void powerOn() {
		System.out.println("powerOn() is overidden!");
		
	}
}
