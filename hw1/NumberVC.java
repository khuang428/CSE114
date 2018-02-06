import java.util.Scanner;

public class NumberVC {
	public static int letterType(char c) {
		char temp = Character.toLowerCase(c);
		if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
			return 0;
		}else if(Character.isLetter(c)) {
			return 1;
		}
		return -1;	
	}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int vowel = 0,consonant = 0;
		for(int i = 0;i < s.length();i++) {
			switch(letterType(s.charAt(i))) {
			case 0:
				vowel++;
				break;
			case 1:
				consonant++;
				break;
			}
		}
		System.out.printf("The number of vowels is %d\nThe number of consonants is %d",vowel,consonant);
		input.close();
	}
}
