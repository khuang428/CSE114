//Karen Huang
//111644515

import java.util.Scanner;
public class Lab10 {
	
	public static int[] merge(int[]a,int[]b) {
		int inda = 0,indb = 0;
		int[]ret = new int[a.length+b.length];
		while(inda < a.length || indb < b.length) {
			if(inda == a.length) {
				ret[inda+indb] = b[indb];
				indb++;
			}else if(indb == b.length) {
				ret[inda+indb] = a[inda];
				inda++;
			}else if(a[inda] <= b[indb]) {
				ret[inda+indb] = a[inda];
				inda++;
			}else {
				ret[inda+indb] = b[indb];
				indb++;
			}
		}
		return ret;
	}
	
	public static boolean isMarkovMatrix(double[][]m) {
		double colSum = 0;
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				if(m[j][i] < 0) {
					return false;
				}
				colSum += m[j][i];
			}
			if(colSum != 1) {
				return false;
			}
			colSum = 0;
		}
		return true;
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.print("Enter list1 size and contents: ");
		int[] list1 = new int[input.nextInt()];
		for(int i = 0;i < list1.length;i++) {
			list1[i] = input.nextInt();
		}
		System.out.print("Enter list2 size and contents: ");
		int[] list2 = new int[input.nextInt()];
		for(int i = 0;i < list2.length;i++) {
			list2[i] = input.nextInt();
		}
		System.out.print("List1 is ");
		for(int i = 0;i < list1.length;i++) {
			System.out.print(list1[i] +" ");
		}
		System.out.println();
		System.out.print("List2 is ");
		for(int i = 0;i < list2.length;i++) {
			System.out.print(list2[i] +" ");
		}
		System.out.println();
		int[]merged = merge(list1,list2);
		System.out.print("The merged list is ");
		for(int i = 0;i < merged.length;i++) {
			System.out.print(merged[i] +" ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.println("Enter a 3x3 matrix row by row:");
		double[][]m = new double[3][3];
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				m[i][j] = input.nextDouble();
			}
		}
		boolean isMM = isMarkovMatrix(m);
		if(isMM) {
			System.out.println("It is a Markov matrix");
		}else {
			System.out.println("It is not a Markov matrix");
		}
		input.close();
	}

}
