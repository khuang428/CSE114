//Karen Huang
//111644515

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem2 {
	public static int largest(int[]a) {
		if(a.length == 2) {
			if(a[0] >= a[1]) {
				return a[0];
			}else {
				return a[1];
			}
		}
		if(a[0] >= a[1]) {
			swap(a, 0, 1);
		}
		return largest(Arrays.copyOfRange(a, 1, a.length - 1));
	}
	
	private static void swap(int[]a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 8 integers: ");
		int[]arr = new int[8];
		for(int i = 0;i < 8;i++) {
			try {
				arr[i] = input.nextInt();
			}catch(InputMismatchException e) {
				System.out.println();
				input.next();
				System.out.println("Enter an integer: ");
			}
		}
		System.out.println("The largest integer is: " + largest(arr));
		input.close();
	}
}
