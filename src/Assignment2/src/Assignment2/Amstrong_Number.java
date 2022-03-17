package Assignment2;
import java.util.*;

public class Amstrong_Number {

	public static void main(String[] args) {
		int num1,number = 0,temp,total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer number:");
		num1=sc.nextInt();
		number=num1;
		while(number != 0 )
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number /=10;
		}
		if(total==num1)
			System.out.println(+num1+" is Amstrong number.");
		else
			System.out.println(+num1+ " is Not a Amstrong number.");
		sc.close();

	}

}
