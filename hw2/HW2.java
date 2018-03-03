//Karen Huang
//111644515

import java.util.Scanner;

public class HW2 {
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static boolean isAnagram(String s1, String s2) {
		int[] letters = new int[26];
		for(int i = 0;i < s1.length();i++) {
			letters[s1.charAt(i) - 97]++;
			letters[s2.charAt(i) - 97]--;
		}
		for(int j = 0;j < 26;j++) {
			if(letters[j] != 0) {
				return false;
			}
		}
		return true;
	}
	
	//helper for number 3
	public static void swap(String[]s,int a,int b) {
		String temp = s[a];
		s[a] = s[b];
		s[b] = temp;
	}
	
	public static String[] bubbleSort(String[]a) {
		for(int j = 0;j < a.length;j++) {
			for(int i = 1;i < a.length;i++) {
				if(a[i].compareTo(a[i-1]) < 1) {
					swap(a,i,i-1);
				}
			}
		}
		return a;
	}
	
	public static double[][] multiplyMatrix(double[][]a,double[][]b){
		double [][]ret = new double[3][3];
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				ret[i][j] = a[i][0] * b[0][j] +
							a[i][1] * b[1][j] +
							a[i][2] * b[2][j];
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.print("Enter a string: ");
		String in1 = input.nextLine();
		String s1 = in1.replaceAll("\\s+", "").toLowerCase();
		if(isPalindrome(s1)) {
			System.out.printf("Input string %s is a palindrome\n", in1);
		}else {
			System.out.printf("Input string %s is not a palindrome\n", in1);
		}
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.print("Enter the first string: ");
		boolean valIn = true;
		String in2a = input.nextLine();
		String s2a = in2a.replaceAll("\\s+", "").toLowerCase();
		System.out.print("Enter the second string: ");
		String in2b = input.nextLine();
		String s2b = in2b.replaceAll("\\s+", "").toLowerCase();
		if(s2a.length() != s2b.length()) {
			System.out.println("Enter strings with the same length");
		}else {
			for(int i = 0;i < s2a.length();i++) {
				if(!Character.isLetter(s2a.charAt(i))||!Character.isLetter(s2b.charAt(i))) {
					System.out.println("Please only enter letters");
					valIn = false;
					break;
				}
			}
		}
		if(valIn) {
			if(isAnagram(s2a,s2b)) {
				System.out.printf("%s and %s are anagrams",in2a,in2b);
			}else {
				System.out.printf("%s and %s are not anagrams",in2a,in2b);
			}
		}
		System.out.println("----------------------------------");
		System.out.println("Question #3");
		System.out.println("----------------------------------");
		System.out.println("Enter 10 strings: (one per line)");
		String[]ins = new String[10];
		for(int i = 0;i < 10;i++) {
			ins[i] = input.nextLine();
		}
		System.out.print("Sorted strings: ");
		String[]out3 = bubbleSort(ins);
		for(int i = 0;i < out3.length-1;i++) {
			System.out.print(out3[i] + ", ");
		}
		System.out.print(out3[out3.length-1]);
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Question #4");
		System.out.println("----------------------------------");
		System.out.print("Enter matrix 1: ");
		double[][]in4a = new double[3][3];
		for(int i = 0;i < 3;i++) {
			for (int j = 0;j < 3;j++) {
				in4a[i][j] = input.nextDouble();
			}
		}
		input.nextLine();
		System.out.print("Enter matrix 2: ");
		double[][]in4b = new double[3][3];
		for(int i = 0;i < 3;i++) {
			for (int j = 0;j < 3;j++) {
				in4b[i][j] = input.nextDouble();
			}
		}
		double[][]out4 = multiplyMatrix(in4a,in4b);
		System.out.println("Multiplication of the matrices is: ");
		for(int i = 0;i < out4.length;i++) {
			for(int j = 0;j < out4[i].length;j++) {
				System.out.printf("%.1f ",out4[i][j]);
			}
			System.out.println();
		}
		input.close();
	}
}
