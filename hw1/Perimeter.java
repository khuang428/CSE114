import java.util.Scanner;

public class Perimeter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 edges: ");
		double e1 = 0, e2 = 0, e3 = 0;
		if(!input.hasNextDouble()) {
			System.out.println("Please enter 3 numbers");
		}else {
			e1 = input.nextDouble();
			e2 = input.nextDouble();
			e3 = input.nextDouble();
			double sum;
			if(e1 + e2 <= e3 || e1 + e3 <= e2 || e2 + e3 <= e1) {
				System.out.println("Invalid input");
			}else {
				sum = e1 + e2 + e3;
				System.out.printf("The perimeter is %f",sum);
			}
		}
		input.close();
	}
}
