//Karen Huang
//111644515

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

abstract class CollegeApplicant{
	public String name;
	public String college;
	
	public CollegeApplicant(String n, String c) {
		name = n;
		college = c;
	}
	
}

class UndergraduateApplicant extends CollegeApplicant{
	public int sat;
	public double gpa;
	
	public UndergraduateApplicant(String n,String c,int s,double g) {
		super(n,c);
		sat = s;
		gpa = g;
	}
	
	public String toString() {
		return "Name: " + super.name + "\nApplying to: " + super.college + "\nSAT score: " + sat + "\nGPA: " + gpa;
	}
}

class GraduateApplicant extends CollegeApplicant{
	public int sat;
	public double gpa;
	public String origin;
	
	public GraduateApplicant(String n,String c,int s,double g, String o) {
		super(n,c);
		sat = s;
		gpa = g;
		origin = o;
	}
	
	public String from() {
		if(origin.equals(super.college)) {
			return "from inside";
		}else {
			return "from outside";
		}
	}
	
	public String toString() {
		return "Name: " + super.name + "\nApplying to: " + super.college + " " + from() + "\nSAT score: " + sat + "\nGPA: " + gpa;
	}
}

public class Lab20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.println("Current working directory is " + new File(".").getAbsoluteFile());
		System.out.print("Enter the path of the file: ");
		File f = new File(input.nextLine());
		try {
			Scanner file = new Scanner(f);
			double scores = 0;
			int numScores = 0;
			while(file.hasNextDouble()) {
				scores += file.nextDouble();
				numScores++;
			}
			System.out.printf("The total is %.2f and the average is %.2f\n",scores,scores/numScores);
			file.close();
		}catch(FileNotFoundException e) {
			System.out.println("Cannot find file");
		}
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.print("Enter the name of the undergraduate applicant: ");
		String n1 = input.nextLine();
		System.out.print("Enter the college that the undergraduate is applying for: ");
		String c1 = input.nextLine();
		System.out.print("Enter the SAT score of the undergraduate applicant: ");
		int s1 = input.nextInt();
		System.out.print("Enter the GPA of the undergraduate applicant: ");
		double g1 = input.nextDouble();
		UndergraduateApplicant u = new UndergraduateApplicant(n1,c1,s1,g1);
		System.out.println(u);
		System.out.println("----------------------------------");
		input.nextLine();
		System.out.print("Enter the name of the graduate applicant: ");
		String n2 = input.nextLine();
		System.out.print("Enter the college that the graduate is applying for: ");
		String c2 = input.nextLine();
		System.out.print("Enter the SAT score of the graduate applicant: ");
		int s2 = input.nextInt();
		System.out.print("Enter the GPA of the graduate applicant: ");
		double g2 = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the graduate's original college: ");
		String o2 = input.nextLine();
		System.out.println();
		GraduateApplicant g = new GraduateApplicant(n2,c2,s2,g2,o2);
		System.out.println(g);
		input.close();
	}

}
