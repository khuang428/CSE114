//Karen Huang
//111644515

abstract class Shape{
	public Shape(){
	}
	
	public String toString() {
		return "";
	}
}

abstract class TwoDimensionalShape extends Shape{
	public TwoDimensionalShape() {
	}
	
	public String toString() {
		return "";
	}
	
	public double getArea() {
		return 0;
	}
}

abstract class ThreeDimensionalShape extends Shape{
	public ThreeDimensionalShape() {
	}
	
	public String toString() {
		return "";
	}
	
	public double getArea() {
		return 0;
	}
	
	public double getVolume() {
		return 0;
	}
}

class Circle extends TwoDimensionalShape{
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
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		return "Circle with radius of " + radius;
	}
}

class Square extends TwoDimensionalShape{
	private double side;
	
	public Square() {
		side = 1;
	}
	
	public Square(double s) {
		side = s;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getArea() {
		return Math.pow(side, 2);
	}
	
	public String toString() {
		return "Square with side of " + side;
	}
}

class Triangle extends TwoDimensionalShape{
	private double side;
	
	public Triangle() {
		side = 1;
	}
	
	public Triangle(double s) {
		side = s;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getArea() {
		return Math.pow(side, 2) * Math.sqrt(3) / 4;
	}
	
	public String toString() {
		return "Equilateral triangle with side of " + side;
	}
}

class Sphere extends ThreeDimensionalShape{
	private double radius;
	
	public Sphere() {
		radius = 1;
	}
	
	public Sphere(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public double getVolume() {
		return 4 * Math.PI * Math.pow(radius, 3) / 3;
	}
	
	public String toString() {
		return "Sphere with radius of " + radius;
	}
}

class Cube extends ThreeDimensionalShape{
	private double side;
	
	public Cube() {
		side = 1;
	}
	
	public Cube(double s) {
		side = s;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getArea() {
		return 6 * Math.pow(side, 2);
	}
	
	public double getVolume() {
		return Math.pow(side, 3);
	}
	
	public String toString() {
		return "Cube with side of " + side;
	}
}

class Tetrahedron extends ThreeDimensionalShape{
	private double side;
	
	public Tetrahedron() {
		side = 1;
	}
	
	public Tetrahedron(double s) {
		side = s;
	}
	
	public double getSide() {
		return side;
	}

	public double getArea() {
		return Math.sqrt(3) * Math.pow(side, 2);
	}

	public double getVolume() {
		return Math.pow(side, 3) / (6 * Math.sqrt(2));
	}
	
	public String toString() {
		return "Regular tetrahedron with side of " + side;
	}
}

public class Problem2 {
	public static void main(String[] args) {
		Shape[] arr = new Shape[6];
		arr[0] = new Circle(2);
		arr[1] = new Square(3);
		arr[2] = new Triangle(4);
		arr[3] = new Sphere(5);
		arr[4] = new Cube(4);
		arr[5] = new Tetrahedron(3);
		int i = 1;
		for(Shape s : arr) {
			if(s instanceof TwoDimensionalShape) {
				System.out.println(i + ")A two dimensional shape: \n" + s.toString());
				System.out.println("Area is " + ((TwoDimensionalShape)s).getArea());
				System.out.println("----------------------------------");
			}else if(s instanceof ThreeDimensionalShape) {
				System.out.println(i + ")A three dimensional shape: \n" + s.toString());
				System.out.println("Surface area is " + ((ThreeDimensionalShape)s).getArea());
				System.out.println("Volume is " + ((ThreeDimensionalShape)s).getVolume());
				System.out.println("----------------------------------");
			}
			i++;
		}
 	}

}
