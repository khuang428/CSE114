//Karen Huang
//111644515

import java.util.Scanner;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex() {
		real = 1;
		imaginary = 1;
	}
	
	public Complex(double r,double i) {
		real = r;
		imaginary = i;
	}
	
	public void setR(double r) {
		real = r;
	}
	
	public void setI(double i) {
		imaginary = i;
	}
	
	public double getR() {
		return real;
	}
	
	public double getI() {
		return imaginary;
	}
	
	public static double[] add(Complex a, Complex b) {
		double[]ret = new double[2];
		ret[0] = a.getR() + b.getR();
		ret[1] = a.getI() + b.getI();
		return ret;
	}
	
	public static double[] subtract(Complex a, Complex b) {
		double[]ret = new double[2];
		ret[0] = a.getR() - b.getR();
		ret[1] = a.getI() - b.getI();
		return ret;
	}
	
	public void print() {
		System.out.printf("(%.1f, %.1f)",real,imaginary);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the real part of the first number: ");
		double f = input.nextDouble();
		System.out.print("Enter the imaginary part of the first number: ");
		Complex a = new Complex(f,input.nextDouble());
		System.out.print("Enter the real part of the second number: ");
		f = input.nextDouble();
		System.out.print("Enter the imaginary part of the second number: ");
		Complex b = new Complex(f,input.nextDouble());
		System.out.print("First complex number: ");
		a.print();
		System.out.println();
		System.out.print("Second complex number: ");
		b.print();
		System.out.println();
		System.out.printf("Addition of the complex numbers: (%.1f, %.1f)\n",add(a,b)[0],add(a,b)[1]);
		System.out.printf("Subtraction of the complex numbers: (%.1f, %.1f)\n",subtract(a,b)[0],subtract(a,b)[1]);
		input.close();
	}
}
