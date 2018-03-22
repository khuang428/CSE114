//Karen Huang
//111644515

class Stock{
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String s,String n) {
		symbol = s;
		name = n;
	}
	
	public void setPrev(double p) {
		previousClosingPrice = p;
	}
	
	public void setCurr(double p) {
		currentPrice = p;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrev() {
		return previousClosingPrice;
	}
	
	public double getCurr() {
		return currentPrice;
	}
	
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}

class RegularPolygon{
	private int n; //number of sides
	private double side; //length of side
	private double x; //xcor of center
	private double y; //ycor of center
	
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int n, double s) {
		this.n = n;
		side = s;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int n, double s, double x, double y) {
		this.n= n;
		side = s;
		this.x = x;
		this.y = y;
	}
	
	public int getN() {
		return n;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setN(int n) {
		this.n= n;
	}
	
	public void setSide(double s) {
		side = s;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return n*side;
	}
	
	public double getArea() {
		return (n * side * side) / (4 * Math.tan(Math.PI / n));
	}
}

public class Lab13 {
	public static void main(String[]args) {
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		Stock oracle = new Stock("ORCL", "Oracle Corporation");
		oracle.setPrev(34.5);
		oracle.setCurr(34.35);
		System.out.printf("The price change percentage for %s(%s) is %.3f%%\n",oracle.getName(),oracle.getSymbol(),oracle.getChangePercent());
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6,4);
		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.printf("r1 : The perimeter is %.3f and the area is %.3f\n", r1.getPerimeter(),r1.getArea());
		System.out.printf("r2 : The perimeter is %.3f and the area is %.3f\n", r2.getPerimeter(),r2.getArea());
		System.out.printf("r3 : The perimeter is %.3f and the area is %.3f\n", r3.getPerimeter(),r3.getArea());
	}
}
