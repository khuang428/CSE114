//Karen Huang
//111644515

import java.util.Scanner;

public class Lab8 {
	public static void starsTriangle(int num) {
		for(int a = 1;a <= num;a++) {
			for(int b = num;b >= a;b--) {
				System.out.print(" ");
			}
			for(int c = 1;c <= a;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}		
	
	public static String reverse(String s) {
		String retStr = "";
		for(int i = s.length()-1;i >=0;i--) {
			retStr += s.charAt(i);
		}
		return retStr;
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.print("Enter the value of n:");
		int n = input.nextInt();
		starsTriangle(n);
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.print("Input the string:");
		input.nextLine();
		String in = input.nextLine();
		System.out.println(reverse(in));
		input.close();
	}
}
