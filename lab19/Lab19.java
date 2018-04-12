//Karen Huang
//111644515

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.print("Enter an integer(2 left): ");
		int a = 0,b = 0;
		boolean aI = false, bI = false;
		while(!aI) {
			try {
				a = input.nextInt();	
				aI = true;
			}catch(InputMismatchException e) {
				input.nextLine();
				System.out.print("Enter an integer(2 left): ");
			}
		}
		System.out.print("Enter an integer(1 left): ");
		while(!bI) {
			try {
				b = input.nextInt();
				bI = true;
			}catch(InputMismatchException e) {
				input.nextLine();
				System.out.print("Enter an integer(1 left): ");
			}
		}
		System.out.printf("The sum of integers is %d\n",a+b);
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		int[]arr = new int[100];
		for(int i = 0;i < 100;i++) {
			arr[i] = (int)(Math.random() * 100);
		}
		System.out.print("Enter the index: ");
		int n = input.nextInt();
		try {
			System.out.printf("Element at index %d is %d",n,arr[n]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
		input.close();
	}
}
