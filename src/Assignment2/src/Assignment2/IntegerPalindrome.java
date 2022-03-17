package Assignment2;
import java.util.*;
public class IntegerPalindrome {
	public static void main(String[] args) {
		int num, reversedNum = 0, remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer Number:");
		
		num = sc.nextInt();
		int originalNum = num;
		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}
		if (originalNum == reversedNum) {
			System.out.println(originalNum + " is Palindrome.");
		} else {
			System.out.println(originalNum + " is not Palindrome.");
		}
		sc.close();
	}
}
