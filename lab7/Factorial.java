//Karen Huang
//111644515

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int fact = 1;
		for(int i = input.nextInt();i > 0;i--) {
			fact *= i;
		}
		System.out.printf("Factorial is: %d\n",fact);
		input.close();
	}
}
