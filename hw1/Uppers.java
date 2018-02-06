import java.util.Scanner;

public class Uppers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int upper = 0;
		for(int i = 0;i < s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				upper++;
			}
		}
		System.out.printf("The number of uppercase letters is %d", upper);
		input.close();
	}
}
