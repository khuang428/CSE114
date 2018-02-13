//Karen Huang
//111644515
import java.util.Scanner;

public class PolyArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int numSides = input.nextInt();
		System.out.print("Enter the length of a side: ");
		double sideLen = input.nextDouble();
		double area = (numSides * sideLen * sideLen) / (4 * Math.tan(Math.PI / numSides));
		System.out.printf("The area of the polygon is %f",area);
		input.close();
	}
}
