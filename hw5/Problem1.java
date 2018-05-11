//Karen Huang
//111644515

abstract class GeometricObject implements Comparable<GeometricObject>{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {   return color;  }
	public void setColor(String color) {  this.color = color;  }
	public boolean isFilled() {   return filled;  }
  	public void setFilled(boolean filled) {  this.filled = filled;  }
  	public java.util.Date getDateCreated() {   return dateCreated;  }
  	public String toString() {
	  return "created on " + dateCreated + "\ncolor: " + color +
			 " and filled: " + filled;
  	}
  	public abstract double getArea();
  	public abstract double getPerimeter();
  	
  	public static GeometricObject max(GeometricObject a, GeometricObject b) {
  		if(a.compareTo(b) > 0) {
  			return a;
  		}else if(a.compareTo(b) < 0) {
  			return b;
  		}else {
  			return null;
  		}
  	}
}

class Circle extends GeometricObject{
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}
	
	public int compareTo(GeometricObject o) {
		if(radius == ((Circle)o).getRadius()) {
			return 0;
		}else if(radius > ((Circle)o).getRadius()) {
			return 1;
		}else {
			return -1;
		}
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	public String toString() {
		return "Circle with radius: " + radius + "\narea: "+ getArea() + "\nperimeter: "+ getPerimeter();
	}
	
}

class Rectangle extends GeometricObject{
	private double side1;
	private double side2;
	
	public Rectangle(double s1,double s2) {
		side1 = s1;
		side2 = s2;
	}

	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public int compareTo(GeometricObject o) {
		if(getArea() == ((Rectangle)o).getArea()) {
			return 0;
		}else if(getArea() > ((Rectangle)o).getArea()) {
			return 1;
		}else {
			return -1;
		}
	}

	public double getArea() {
		return side1 * side2;
	}

	public double getPerimeter() {
		return 2*side1 +  2*side2;
	}
	
	public String toString() {
		return "Rectangle with side 1: " + side1 + "\nside 2: " + side2 + "\narea: "+ getArea() + "\nperimeter: "+ getPerimeter();
	}
}

public class Problem1 {
	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(5);
		System.out.println(c1);
		System.out.println("----------------------------------");
		System.out.println(c2);
		System.out.println("----------------------------------");
		if(GeometricObject.max(c1, c2) == null) {
			System.out.println("They are the same size.");
		}else {
			System.out.println("The larger circle is " + GeometricObject.max(c1, c2));
		}
		System.out.println("----------------------------------");
		Rectangle r1 = new Rectangle(2,4);
		Rectangle r2 = new Rectangle(3,2);
		System.out.println(r1);
		System.out.println("----------------------------------");
		System.out.println(r2);
		System.out.println("----------------------------------");
		if(GeometricObject.max(r1, r2) == null) {
			System.out.println("They are the same size.");
		}else {
			System.out.println("The larger rectangle is " + GeometricObject.max(r1, r2));
		}
	}
}
