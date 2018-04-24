//Karen Huang
//111644515

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

abstract class Vehicle{
	String owner;
	int wheels;
	
	public Vehicle(String o, int w) {
		owner = o;
		wheels = w;
	}
}

class Bicycle extends Vehicle{
	public Bicycle(String o,int w) {
		super(o,w);
	}
	
	public String toString() {
		return "The owner of the " + wheels + "-wheeled bike is " + super.owner;
	}
}

class MotorizedVehicle extends Vehicle{
	double volumeDisplacement;
	
	public MotorizedVehicle(String o, int w, double v) {
		super(o,w);
		volumeDisplacement = v;
	}
	
	public double horsepower() {
		return volumeDisplacement / super.wheels;
	}
	
	public String toString() {
		return "The owner of the " + wheels + "-wheeled motorized vehicle is " + super.owner +
				"\nThe motorized vehicle has " + horsepower() + " horsepower";
	}
}

public class Lab21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.println("Current working directory: " + new File(".").getAbsoluteFile());
		System.out.print("Enter the path of the first file: ");
		File f1 = new File(input.nextLine());
		System.out.print("Enter the path of the second file: ");
		File f2 = new File(input.nextLine());
		try {
			Scanner file1 = new Scanner(f1);
			Scanner file2 = new Scanner(f2);
			int numDif = 0;
			while(file1.hasNextLine() && file2.hasNextLine()) {
				if(!file1.nextLine().equals(file2.nextLine())) {
					numDif++;
				}
			}
			if(file1.hasNextLine()) {
				while(file1.hasNextLine()) {
					numDif++;
					file1.nextLine();
				}
			}else if(file2.hasNextLine()) {
				while(file2.hasNextLine()) {
					numDif++;
					file2.nextLine();
				}
			}
			file1.close();
			file2.close();
			if(numDif == 0) {
				System.out.println("Files are identical");
			}else {
				System.out.println(numDif + " lines are different");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.print("Enter the owner of the bicycle: ");
		String o1 = input.nextLine();
		System.out.print("Enter the number of wheels on the bicycle: ");
		int w1 = input.nextInt();
		Bicycle b = new Bicycle(o1,w1);
		System.out.print("Enter the owner of the motorized vehicle: ");
		input.nextLine();
		String o2 = input.nextLine();
		System.out.print("Enter the number of wheels on the motorized vehicle: ");
		int w2 = input.nextInt();
		System.out.print("Enter the engine volume displacement in liters: ");
		double v = input.nextDouble();
		MotorizedVehicle mv = new MotorizedVehicle(o2,w2,v);
		System.out.println(b);
		System.out.println(mv);
		input.close();

	}

}
