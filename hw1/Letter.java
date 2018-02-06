import java.util.Scanner;

public class Letter {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String s = input.nextLine(); 
		if(s.length() > 1) {
			System.out.println("Please enter only 1 letter");
		}else {
			char c = s.charAt(0);
			char temp = Character.toLowerCase(c);
			if(!Character.isLetter(c)) {
				System.out.printf("%s is an invalid input",c);
			}else if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
				System.out.printf("%s is a vowel", c);
			}else {
				System.out.printf("%s is a consonant", c);
			}
		}
		input.close();
	}
}
