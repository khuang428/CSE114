//Karen Huang
//111644515

import java.util.Scanner;

public class Lab9 {
	public static double mean(double[] x) {
		double sum = 0;
		for(int i = 0;i < x.length;i++) {
			sum += x[i];
		}
		return sum/x.length;
	}

	public static double deviation(double[] x) {
		double mean = mean(x);
		double sum = 0;
		for(int i = 0;i < x.length;i++) {
			sum += Math.pow(x[i] - mean, 2);
		}
		double frac = sum / (x.length - 1);
		return Math.sqrt(frac);
	}
	
	public static int[] eliminateDuplicate(int[] list) {
		for(int i = 0;i < list.length;i++) {
			for(int j = list.length - 1;j > i;j--) {
				if(list[j] == list[i]) {
					list[j] = 0;
				}
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.print("Enter 10 numbers:");
		double[]num1 = new double[10];
		for(int i = 0;i < 10;i++) {
			num1[i] = input.nextDouble();
		}
		System.out.printf("The mean is %.2f\n",mean(num1));
		System.out.printf("The standard deviation is %f\n", deviation(num1));
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.print("Enter 10 numbers:");
		int[]num2 = new int[10];
		for(int i = 0;i < 10;i++) {
			num2[i] = input.nextInt();
		}
		System.out.print("The distinct numbers are: ");
		for(int i = 0;i < 10;i++) {
			if(eliminateDuplicate(num2)[i] != 0) {
				System.out.print(eliminateDuplicate(num2)[i]+" ");
			}
		}
		input.close();
	}
}
