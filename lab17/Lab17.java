//Karen Huang
//111644515

import java.util.Scanner;
import java.util.ArrayList;

public class Lab17 {
	public static ArrayList<Character> toCharacterArray(String s){
		ArrayList<Character> ret = new ArrayList<Character>(s.length());
		for(int i = 0;i < s.length();i++) {
			ret.add(s.charAt(i));
		}
		return ret;
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> origs = new ArrayList<Integer>(list.size());
		for(int i = 0;i < list.size();i++) {
			//System.out.println(list.get(i));
			if(!origs.contains(list.get(i))) {
				origs.add(list.get(i));
			}else {
				list.remove(i);
				i--;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		ArrayList<Character> arr = toCharacterArray(s);
		System.out.print("Elements of the Character array list: ");
		for(int i = 0;i < arr.size();i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.print("Enter 10 integers: ");
		ArrayList<Integer> ints = new ArrayList<Integer>(10);
		for(int i = 0;i < 10;i++) {
			ints.add(input.nextInt());
		}
		removeDuplicate(ints);
		System.out.print("The distinct integers are: ");
		for(int i = 0;i < ints.size();i++) {
			System.out.print(ints.get(i)+ " ");
		}
		input.close();
	}

}
