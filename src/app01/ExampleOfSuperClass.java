package app01;

class ExampleOfSuperClass {
	
	private int a;
	private int b;
	public ExampleOfSuperClass() {
		super();
		
	}
	public ExampleOfSuperClass(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	

}
public class B extends ExampleOfSuperClass{
	private int c;
	private int d;
	public B() {
		super();
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}

	
	
}
