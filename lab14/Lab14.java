//Karen Huang
//111644515

import java.util.Scanner;

class LinearEquation{
	private double a,b,c,d,e,f;
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		if(((a*d) - (b*c)) == 0) {
			return false;
		}
		return true;
	}
	
	public double getX() {
		return (((e*d) - (b*f))/((a*d) - (b*c)));
	}
	
	public double getY() {
		return (((a*f) - (e*c))/((a*d) - (b*c)));
	}
}
public class Lab14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		int[][]matrix = new int[4][4];
		for(int i = 0;i < 4;i++) {
			for(int j = 0;j < 4;j++) {
				matrix[i][j] = (int)(Math.random() * 2);
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		int rMax = 0, cMax = 0, rSum = 0, cSum = 0;
		int r = 0, c = 0;
		for(int i = 0;i < 4;i++) {
			for(int j = 0;j < 4;j++) {
				rSum += matrix[i][j];
				cSum += matrix[j][i];
			}
			if(rSum > rMax) {
				r = i;
				rMax = rSum;
			}
			if(cSum > cMax) {
				c = i;
				cMax = cSum;
			}
			rSum = 0;
			cSum = 0;
		}
		System.out.println("The largest row index: "+r);
		System.out.println("The largest column index: "+c);
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.print("Enter a, b, c, d, e, f: ");
		LinearEquation le = new LinearEquation(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		if(le.isSolvable()) {
			System.out.printf("X is %.2f and Y is %.2f\n", le.getX(),le.getY());
		}else {
			System.out.println("The equation has no solutions.");
		}
		input.close();
	}
}
