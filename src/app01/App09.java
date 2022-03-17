package app01;

public class App09 {
	public static void main(String[] args) {
		A b=new A();
		boolean ans=b instanceof A;
		System.out.println("is child type?"+ans);
		
		System.out.println(b.getA());
		System.out.println(b.getB());
	//	System.out.println(b.getC());
	//	System.out.println(b.getD());
		
		System.out.println("****************");
		A a=new B();// Up casting
		System.out.println(a.getA());
		System.out.println(a.getB());
	//	System.out.println(a.getC());
	//	System.out.println(a.getD());
		
		//reverse inheritance is not possible
		System.out.println("=================");
//		B bb=(B)new A();  // Down Casting // class cost exception
	//	System.out.println(bb.getA());
	//	System.err.println(bb.getB());
	//	System.out.println(bb.getC());
	//	System.out.println(bb.getD());
		
		System.out.println("##################");
		A aa=new B();//up casting
		B bbb=(B) aa;//down casting => B bbb = new B();
		System.out.println(bbb.getA()); 
		System.out.println(bbb.getB());
		System.out.println(bbb.getC());
		System.out.println(bbb.getD());
		
		// ctrl /
		System.out.println("&&&&&&&&&&");
		A aaa=new C();
		C ccc=(C) aaa;
		System.out.println(ccc.getA()); 
		System.out.println(ccc.getB());
		System.out.println(ccc.getC()); 
		System.out.println(ccc.getD());
		System.out.println(ccc.getE());
		System.out.println(ccc.getF());
		
		
	}

}
