
package app01;

public class app05 {
	static {
		System.out.println("static multiple initialzer get executed!");
		app05 ap = new app05();
		int a=app05.returnMeInt();
		System.out.println("Value received is "+a);
	}
	static int a=10;
	public static void demoStaticMethod(){
		System.out.println("demoStaticMethod() method got executed!");
	}
	public int returnMeInt()
	{
		return 10;
	}
	public void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod() method got executed!");
	}
	public static void main(String args[]) {
		System.out.println("Main(string[] args) method got executed!");

	}

}
