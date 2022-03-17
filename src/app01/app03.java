package app01;

public class app03 {
	public static void main(String[] ss)
	{
		int a=11;
		int b=12;
		int c=13;
		int d=14;
		int e=15;
		int res = (a>b && a>c && a>d && a>e)? a : (b<c && b<d && b<e) ? b : (c>d && c>e)? c : (d>e) ? d : e ;  
		System.out.println("result"+res);
	}

}
