//Karen Huang
//111644515

import java.util.Date;

class Account{
	private int id;
	private double balance;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		id = 0;
		balance = 0;
		dateCreated = new Date();
	}
	
	public Account(int i, double b) {
		id = i;
		balance = b;
		dateCreated = new Date();
	}
	
	public void setID(int i) {
		id = i;
	}
	
	public void setBalance(double b) {
		balance = b;
	}
	
	public static void setARate(double r) {
		annualInterestRate = r;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getARate() {
		return annualInterestRate;
	}
	
	public Date getDate() {
		return dateCreated;
	}
	
	public double getMRate() {
		return annualInterestRate / 12;
	}
	
	public double getMInterest() {
		return balance * (getMRate() / 100);
	}
	
	public void withdraw(double w) {
		balance -= w;
	}
	
	public void deposit(double d) {
		balance += d;
	}
}

class Person{
	private String name;
	private String address;
	private int phoneNumber;
	private String email;
	
	public Person() {
		name = "Bob";
	}
	
	public Person(String s) {
		name = s;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String toString() {
		return "Person: " + name;
	}
}

class Student extends Person{
	private String status;
	
	public Student(String s){
		super(s);
	}
	
	public String toString() {
		return "Student: " + super.getName();
	}
}

class Employee extends Person{
	private String offic;
	private double salary;
	private Date dateHired;
	
	public Employee() {
		super();
	}
	
	public Employee(String s) {
		super(s);
	}
	
	public String toString() {
		return "Employee: " + super.getName();
	}
}

class Faculty extends Employee{
	private String officeHours;
	private String rank;
	
	public Faculty(String s) {
		super(s);
	}
	
	public String toString() {
		return "Faculty: "+ super.getName();
	}
}

class Staff extends Employee{
	private String title;
	
	public Staff(String s) {
		super(s);
	}
	
	public String toString() {
		return "Staff: " + super.getName();
	}
}
	
public class Lab15 {
	public static void main(String[] args) {
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		Account a = new Account(1122,20000);
		Account.setARate(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.printf("Account balance is %.2f\n",a.getBalance());
		System.out.printf("The monthly interest is %.2f\n",a.getMInterest());
		System.out.printf("The account was created on %s\n",a.getDate().toString());
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		Person p = new Person("Pete");
		Student s = new Student("Shirley");
		Employee e = new Employee("Eric");
		Faculty f = new Faculty("Farha");
		Staff st = new Staff("Steven");
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(st.toString());
	}

}
