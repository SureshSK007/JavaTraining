package com.oops.Polymorphism.compiletime;

class Parent {
	int a=10;
	public static void test() {
		System.out.println("parent() method is executed");
		
	}
}
class Child extends Parent{
	int a=20;
	public static void test() {
		System.out.println("Child() method is executed");
	}
}
public class App32 {
// compile time polymorphism
	public static void main(String[] args ) {
		Parent parent_=new Child();
		parent_.test(); //  parent class static test method is called! 
		Child child_=(Child) parent_;
		child_.test(); //  child class static test method is called! 
	}

}
