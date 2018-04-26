abstract class GeometricObject implements Colorable{
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
  
  /** Abstract method getArea */
  public abstract double getArea();
  
  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}

interface Colorable{
	public void howToColor();
}

class Rectangle extends GeometricObject implements Colorable{
	  private double width;
	  private double height;
	  
	  public Rectangle() {  }
	  
	  public Rectangle(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }
	  
	  public double getWidth() {    return width;  }
	  
	  public void setWidth(double width) {     this.width = width;  }
	  
	  public double getHeight() {    return height;  }
	  
	  public void setHeight(double height) {    this.height = height;  }
	  
	  public double getArea() {
	    return width * height;
	  }

	  public double getPerimeter() {
	    return 2 * (width + height);
	  }
	  
	  public void howToColor() {
		  System.out.println("Color each side a different color(rectangle)");
	  }
	}

class Circle extends GeometricObject implements Comparable<Circle>,Colorable{
	  private double radius;
	  
	  public Circle() {   }
	  
	  public Circle(double radius) {
	    this.radius = radius;  
	  }
	  
	  public double getRadius() {
	    return radius;
	  }
	  
	  public void setRadius(double radius) {
	    this.radius = radius;  
	  }
	  
	  public double getArea() {
	    return radius * radius * Math.PI;
	  }
	  
	  public double getDiameter() {
	    return 2 * radius;
	  }
	  
	  public double getPerimeter() {
	    return 2 * radius * Math.PI;
	  }
	  
	  /* Print the circle info */
	  public void printCircle() {
	    System.out.println("The circle is created " + getDateCreated() +
	      " and the radius is " + radius);
	  }

	  public int compareTo(Circle c) {
		  if(getArea() == c.getArea()) {
			  return 0;
		  }else if(getArea() > c.getArea()) {
			  return 1;
		  }else {
			  return -1;
		  }
	  }
	  
	  public void howToColor() {
		  System.out.println("Color in a spiral(circle)");
	  }
	  
	}

class Triangle extends GeometricObject implements Colorable{
	private double side;
	
	public Triangle() {
		side = 1;
	}
	
	public Triangle(double s) {
		side = s;
	}
	
	public void howToColor() {
		System.out.println("Color 3 sides(triangle)");
	}


	public double getArea() {
		return Math.pow(side, 2) * Math.sqrt(3) / 4;
	}


	public double getPerimeter() {
		return side * 3;
	}
	
}

class Square extends GeometricObject implements Colorable{
	private double side;
	
	public Square() {
		side = 0;
	}
	
	public Square(double s) {
		side = s;
	}

	public void howToColor() {
		System.out.println("Color all four sides(square)");
	}

	public double getArea() {
		return Math.pow(side, 2);
	}

	public double getPerimeter() {
		return 4 * side;
	}
}

public class Lab22 {
	public static void main(String[] args) {
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(2);
		if(c1.compareTo(c2) == 0) {
			System.out.println("The circles are the same size.");
		}else if(c1.compareTo(c2) > 0) {
			System.out.println("Circle 1 is larger than Circle 2");
		}else {
			System.out.println("Circle 2 is larger than Circle 1");
		}
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		GeometricObject[]arr = new GeometricObject[4];
		arr[0] = new Square();
		arr[1] = new Rectangle();
		arr[2] = new Circle();
		arr[3] = new Triangle();
		for(int i = 0;i < 4;i++) {
			arr[i].howToColor();
		}
	}

}
