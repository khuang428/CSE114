//Karen Huang
//111644515

public class RandomAverage {
	public static void main(String[] args) {
		double total = 0;
		for(int i = 0;i < 10;i++) {
			total += (int)(Math.random() * 100);
		}
		System.out.print(total/10);
	}
}
