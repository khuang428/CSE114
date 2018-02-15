//Karen Huang
//111644515

import java.util.Scanner;

public class Cities{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first city:");
		String c1 = input.nextLine();
		System.out.print("Enter the second city:");
		String c2 = input.nextLine();
		System.out.print("Enter the third city:");
		String c3 = input.nextLine();
		String retStr = "The three cities in alphabetical order are ";
		
		int c12 = c1.compareToIgnoreCase(c2);
		int c13 = c1.compareToIgnoreCase(c3);
		int c23 = c2.compareToIgnoreCase(c3);
		
		if(c12 < 0 && c13 < 0){
			retStr += c1 + " ";
			if(c23 < 0){
				retStr += c2 + " " + c3;
			}else{
				retStr += c3 + " " + c2;
			}
		}else if(c12 > 0 && c23 < 0){
			retStr += c2 + " ";
			if(c13 < 0){
				retStr += c1 + " " + c3;
			}else{
				retStr += c3 + " " + c1;
			}
		}else{
			retStr += c3 + " ";
			if(c12 < 0){
				retStr += c1 + " " + c2;
			}else{
				retStr += c2 + " " + c1;
			}
		}
		
		System.out.println(retStr);
		input.close();
	}
}