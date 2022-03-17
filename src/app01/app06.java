package app01;

public class app06 {
	static int b=100;
	
	{
		System.out.println("non static multiline init got executed");
	}
	int a=100;
	
	public static void demoStaticMethod()
	{
		System.out.println("StaticMethod got executed");
	}
	public void demoNonStaticMethod()
	{
		System.out.println("demoNonStaticMethod() got executed");
	}
	public static void main(String[] args) {
		System.out.println("mainString[] args) method got executed");
		System.out.println("object created");
		demoStaticMethod();
		app06 app06=new app06();
		System.out.println("end");
		
	}
}
