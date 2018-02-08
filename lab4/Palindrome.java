package lab4;
//Karen Huang
//111644515

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive 3 digit number:");
		int n = 0;
		if(!input.hasNextInt()) {
			System.out.println("Please enter a number");
		}else {
			n = input.nextInt();
			if(n > 999 || n < 100) {
				System.out.println("Make sure your number has 3 digits");
			}else if((n % 10) == (n / 100)){
				System.out.printf("%d is a palindrome", n);
			}else {
				System.out.printf("%d is not a palindrome", n);
			}
		}
		input.close();
	}
}
