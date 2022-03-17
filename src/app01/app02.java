package app01;

public class app02 {
	public static void main(String[] args) {
		char a1 = 'A';
		char b1 = 'B';
		char res = (char) (a1 + b1);
		int c1 = 10;
		int d1 = 20;
		int res2 = --c1 + d1++;
		
		//int res3;
		
		System.out.println("result:" + res2);
		System.out.println("result \n" + res);
		
		
		//ternary operator
		boolean res3 = (c1 >= 10)?true:false;
		if (res3) {
			System.out.println(res3 + "is greater/equal to 10");
		}
		else {
			System.out.println(res3 + "is less than 10");
		}
		//System.out.println("result \n" + res3);
		
		int a=11;
		int b=12;
		int c=13;
		int d=14;
		int e=15;
		int res = (a>b && a>c && a>d && a>e)? a : (b<c && b<d && b<e) ? b : (c>d && c>e)? c : (d>e) ? d : e ;  
		System.out.println("result"+res);


	}
}
