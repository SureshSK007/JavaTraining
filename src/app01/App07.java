package app01;

public class App07 {
	int a=10;
	int b=10;
	{
		System.out.println("Non Static multiline initializer got executed");
	}
	public App07()
	{
		System.out.println("Programmer written instruction in App06() constructor");
	}
	public App07(int a) {
		this();
		this.a=a;
		System.out.println("Programmer written instruction in App06(int a) constructor");
		System.out.println(+a);
	}
	public App07(int a,int b) {
		this(a);
		this.b=b;
		System.out.println("Programmer written instruction in App06(int a,int b) constructor");
		System.out.println(+b);
		System.out.println(+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method got executed");
		App07 app07 = new App07();
		App07 app071 = new App07(30,40);
		System.out.println(app071.a);
		System.out.println(app071.b);
	}

}
