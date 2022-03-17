package com.Interface.InterfaceExample;

public interface Left {
	default void test() {
		System.out.println("Left implemented");
	}

}
