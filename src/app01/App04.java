package app01;

import java.util.Scanner;

public class App04 {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App04 ap=new App04();
		boolean exit=false;
		Scanner sc=new Scanner(System.in);
		
		do 
		{
			//System.out.println("Enter the two integer number:");
			System.out.println("--Calculator--");
			System.out.println("Enter a Option:");
			System.out.println("Select the option to calculator:");
			System.out.println("1 to add");
			System.out.println("2 to sub");
			System.out.println("3 to mul");
			System.out.println("4 to div");
			System.out.println("0 to exit");
			int option=sc.nextInt();
			switch(option) {
			case 1:
				int a=sc.nextInt();
				int b=sc.nextInt();
				ap.add(a,b);
				break;
			case 2:
				int a3=sc.nextInt();
				int b3=sc.nextInt();
				ap.sub(a,b);
				break;
			case 3:
				int a2=sc.nextInt();
				int b2=sc.nextInt();
				ap.mul(a,b);
				break;
			case 4:
				int a1=sc.nextInt();
				int b1=sc.nextInt();
				ap.add(a1,b);
				break;
			default:
				System.exit(0);
				//System.out.println("");
			}
			
			
		}

	}

}
