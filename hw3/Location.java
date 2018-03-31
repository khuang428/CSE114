//Karen Huang
//111644515

import java.util.Scanner;

public class Location {
	public int row;
	public int column;
	public double maxValue;
	
	public Location() {
		row = 0 ;
		column = 0;
		maxValue = 0;
	}
	
	public static Location locateLargest(double[][]a) {
		Location l = new Location();
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < a[i].length;j++) {
				if(a[i][j] > l.maxValue) {
					l.maxValue = a[i][j];
					l.row = i;
					l.column = j;
				}
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int r = input.nextInt();
		int c = input.nextInt();
		double[][]a = new double[r][c];
		System.out.println("Enter the array: ");
		for(int i = 0;i < r;i++) {
			for(int j = 0;j < c;j++) {
				a[i][j] = input.nextDouble();
			}
		}
		Location l = locateLargest(a);
		System.out.printf("The location of the largest element %.1f is at (%d, %d)\n",l.maxValue,l.row,l.column);
		input.close();
	}
}
