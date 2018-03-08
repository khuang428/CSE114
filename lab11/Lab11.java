class Rectangle {
	private double width;
	private double height;
		
	public Rectangle() {
		width = 1;
		height = 1;
	}
		
	public Rectangle(double w,double h) {
		width = w;
		height = h;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimenter() {
		return 2*width + 2*height;
	}
}

public class Lab11 {
	public static void main(String[] args) {
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		Rectangle r1 = new Rectangle(4,40);
		Rectangle r2 = new Rectangle(3.5,35.9);
		System.out.printf("The width, height, area, and perimeter of rectangle 1 are \n%.2f, %.2f, %.2f, and %.2f\n",
							r1.getWidth(),r1.getHeight(),r1.getArea(),r1.getPerimenter());
		System.out.printf("The width, height, area, and perimeter of rectangle 2 are \n%.2f, %.2f, %.2f, and %.2f\n",
				r2.getWidth(),r2.getHeight(),r2.getArea(),r2.getPerimenter());
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		int[] randNums = new int[10];
		for(int i = 0;i < 100;i++) {
			randNums[(int)(Math.random() * 10)]++;
		}
		System.out.println("Count for 100 randomly generated numbers between 0 and 9:");
		for(int j = 0;j < 10;j++) {
			System.out.printf("%d: %d times\n",j,randNums[j]);
		}
	}

}
