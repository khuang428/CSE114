//Karen Huang
//111644515

import java.util.Scanner;

class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }
  
  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }
  
  public String getColor() {   
	  return color; 
  }
  
  public void setColor(String color) { 
	  this.color = color;  
  }
  
  public boolean isFilled() {
	  return filled;  
  }
  
  public void setFilled(boolean filled) {  
	  this.filled = filled; 
  }
  
  public java.util.Date getDateCreated() {  
	  return dateCreated;  
  }
  
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }
  /*
  public static void main(String[] args) {
	  GeometricObject go = new GeometricObject();
	  System.out.println(go);
  }
  */
}

class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	
	public Triangle(double x,double y, double z) {
		side1 = x;
		side2 = y;
		side3 = z;
	}
	
	public double get1() {
		return side1;
	}
	
	public double get2() {
		return side2;
	}
	
	public double get3() {
		return side3;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; 
	}
}

class Circle{
	private double radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius , 2);
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
}

class Cylinder extends Circle{
	private double length;
	
	public Cylinder() {
		super();
		length = 1;
	}
	
	public Cylinder(double r,double l) {
		super(r);
		length = l;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getArea() {
		return 2 * Math.PI * getRadius() * getRadius() + 2 * Math.PI * getRadius() * length;
	}
	
	public double getVolume() {
		return Math.PI * getRadius() * getRadius() * length;
	}
}

public class Lab16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.print("Enter three sides of a triangle: ");
		Triangle t = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.print("Enter a color: ");
		t.setColor(input.next());
		System.out.print("Is the triangle filled?(true/false) ");
		String tf = input.next();
		switch(tf) {
			case "true":
				t.setFilled(true);
				break;
			case "false":
				t.setFilled(false);
				break;
			default:
				t.setFilled(false);
		}
		System.out.println("The triangle's perimeter is " + t.getPerimeter());
		System.out.println("The triangle's area is " + t.getArea());
		System.out.println("The triangle's color is " + t.getColor());
		if(t.isFilled()) {
			System.out.println("The triangle is filled");
		}else {
			System.out.println("The triangle is not filled");
		}
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.print("Enter the radius of a circle: ");
		Circle ci = new Circle(input.nextDouble());
		System.out.print("Enter the radius and length of a cylinder: ");
		Cylinder cy = new Cylinder(input.nextDouble(),input.nextDouble());
		System.out.printf("Circle: Area = %f Perimeter = %f\n",ci.getArea(),ci.getPerimeter());
		System.out.printf("Cylinder: Area = %f Volume = %f\n",cy.getArea(),cy.getVolume());
		input.close();
	}
}
