//Karen Huang
//111644515
import java.util.Scanner;

public class ASCIIToChar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 127: ");
		int n = input.nextInt();
		if(!(n >= 0 && n < 127)) {
			System.out.println("Make sure your integer is between 0 and 127");
		}else {
			System.out.printf("The character for ASCII code %d is %c",n,(char)n);
		}
		input.close();
	}
}
