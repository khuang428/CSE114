//Karen Huang
//111644515

import java.util.Scanner;

class QuadraticEquation{
	
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getDiscriminant() {
		return (b*b) - (4*a*c);
	}
	
	public double getRoot1() {
		if(getDiscriminant() < 0) {
			return 0;
		}else {
			return ((b*-1) + Math.sqrt(getDiscriminant())) / (2*a);
		}
	}
	
	public double getRoot2() {
		if(getDiscriminant() < 0) {
			return 0;
		}else {
			return ((b*-1) - Math.sqrt(getDiscriminant())) / (2*a);
		}
	}
}

public class Lab12 {
	
	public static double sumMajorDiagonal(double[][]m) {
		double sum = 0;
		for(int i = 0;i < m.length;i++) {
			sum += m[i][i];
		}
		return sum;
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.print("Enter a,b,c: ");
		QuadraticEquation qe = new QuadraticEquation(input.nextDouble(),input.nextDouble(),input.nextDouble());
		if(qe.getRoot1() == 0) {
			System.out.println("The equation has no real roots.");
		}else if(qe.getRoot1() == qe.getRoot2()) {
			System.out.println("The equation has one root " + qe.getRoot1());
		}else {
			System.out.println("The equation has two roots " + qe.getRoot1() + " and " + qe.getRoot2());
		}
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.println("Enter a 4x4 matrix row by row:");
		double[][]matrix = new double[4][4];
		for(int i = 0;i < 4;i++) {
			for(int j = 0;j < 4;j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		System.out.printf("The sum of all elements in the major diagonal is %.2f",sumMajorDiagonal(matrix));
		input.close();
	}
}
