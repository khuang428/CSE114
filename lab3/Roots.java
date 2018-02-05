import java.util.Scanner;

public class Roots {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double r1,r2;
		double discriminant = (b*b) - (4*a*c);
		if(discriminant < 0) {
			System.out.println("The equation has no real roots.");
		}else if(discriminant == 0) {
			r1 = (b*-1) / (2*a);
			System.out.printf("The equation has one root %f", r1);
		}else {
			r1 = ((b*-1) + Math.sqrt(discriminant)) / (2*a); 
			r2 = ((b*-1) - Math.sqrt(discriminant)) / (2*a);
			System.out.printf("The equation has two roots %f %f", r1, r2);
		}
					
		input.close();
	}
}
