//Karen Huang
//111644515

import java.util.Scanner;

public class Rational {
	private int numerator;
	private int denominator;
	
	public Rational() {
		numerator = 1;
		denominator = 1;
	}
	
	public Rational(int n,int d) {
		int g = gcd(n,d);
		numerator = n / g;
		denominator = d / g;
	}
	
	public void setN(int n) {
		int g = gcd(n,denominator);
		numerator = n / g;
		denominator /= g;
	}
	
	public void setD(int d) {
		int g = gcd(numerator,d);
		numerator /= g;
		denominator = d / g;
	}
	
	public int getN() {
		return numerator;
	}
	
	public int getD() {
		return denominator;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public static int gcd(int a,int b) {
		int ret = 1;
		for(int i = 1;i <= Math.min(a, b);i++) {
			if(a % i == 0 && b % i == 0) {
				ret = i;
			}
		}
		return ret;
	}
	
	public static int[] add(Rational a, Rational b) {
		int[]ret = new int[2];
		int n1 = a.getN() * b.getD();
		int d1 = a.getD() * b.getD();
		int n2 = b.getN() * a.getD();
		ret[0] = n1 + n2;
		ret[1] = d1;
		int g = gcd(ret[0],ret[1]);
		ret[0] /= g;
		ret[1] /= g;
		return ret;
	}
	
	public static int[] subtract(Rational a, Rational b) {
		int[]ret = new int[2];
		int n1 = a.getN() * b.getD();
		int d1 = a.getD() * b.getD();
		int n2 = b.getN() * a.getD();
		ret[0] = n1 - n2;
		ret[1] = d1;
		int g = gcd(ret[0],ret[1]);
		ret[0] /= g;
		ret[1] /= g;
		return ret;
	}
	
	public static int[] multiply(Rational a, Rational b) {
		int[] ret = new int[2];
		ret[0] = a.getN() * b.getN();
		ret[1] = a.getD() * b.getD();
		int g= gcd(ret[0],ret[1]);
		ret[0] /= g;
		ret[1] /= g;
		return ret;
	}
	
	public static int[] divide(Rational a, Rational b) {
		int[] ret = new int[2];
		ret[0] = a.getN() * b.getD();
		ret[1] = a.getD() * b.getN();
		int g= gcd(ret[0],ret[1]);
		ret[0] /= g;
		ret[1] /= g;
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numerator for the first rational number: ");
		int n = input.nextInt();
		System.out.print("Enter the non-zero denominator for the first rational number: ");
		Rational a = new Rational(n,input.nextInt());
		System.out.print("Enter the numerator for the second rational number: ");
		n = input.nextInt();
		System.out.print("Enter the non-zero denominator for the second rational number: ");
		Rational b = new Rational(n,input.nextInt());
		System.out.println("First rational number is: " + a.toString());
		System.out.println("Second rational number is: " + b.toString());
		System.out.printf("Addition of the rational numbers is: %d/%d\n",Rational.add(a, b)[0],Rational.add(a, b)[1]);
		System.out.printf("Subtraction of the rational numbers is: %d/%d\n",Rational.subtract(a, b)[0],Rational.subtract(a, b)[1]);
		System.out.printf("Multiplication of the rational numbers is: %d/%d\n",Rational.multiply(a, b)[0],Rational.multiply(a, b)[1]);
		System.out.printf("Division of the rational numbers is: %d/%d\n",Rational.divide(a, b)[0],Rational.divide(a, b)[1]);
		input.close();
	}
}
