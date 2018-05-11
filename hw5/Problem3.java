//Karen Huang
//111644515

import java.util.Scanner;

public class Problem3 {
	public static String reverse(String s) {
		if(s.length() == 1) {
			return s;
		}
		return s.charAt(s.length() -1) + reverse(s.substring(0, s.length() - 1));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		System.out.println("The reverse is: " + reverse(input.nextLine()));
		input.close();
	}

}
