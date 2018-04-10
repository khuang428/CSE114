//Karen Huang
//111644515

import java.util.Scanner;
import java.util.ArrayList;

public class Lab18 {	
	public static void sort(ArrayList<Integer> list) {
		int least;
		int temp;
		for(int i = 0;i < list.size();i++) {
			least = i;
			for(int j = i;j < list.size();j++) {
				if(list.get(j) < list.get(least)) {
					least = j;
				}
			}
			temp = list.get(least);
			list.set(least, list.get(i));
			list.set(i, temp);
			/*
			for(int m = 0;m < list.size();m++) {
				System.out.print(list.get(m));
			}
			System.out.println(least);
			System.out.println();
			*/
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Question #1");
		System.out.println("----------------------------------");
		System.out.print("Enter 5 integers: ");
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		for(int i = 0;i < 5;i++) {
			arr.add(input.nextInt());
		}
		sort(arr);
		for(int i = 0;i < arr.size();i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("Question #2");
		System.out.println("----------------------------------");
		System.out.print("Enter the matrix size: ");
		int size = input.nextInt();
		int[][]m = new int[size][size];
		for(int j = 0;j < size;j++) {		
			for(int k = 0;k < size;k++) {
				m[j][k] = (int)(Math.random() * 2);
			}
		}
		System.out.println("The random array is: ");
		ArrayList<Integer> r = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		int rSum = 0;
		int rMax = 0;
		int cSum = 0;
		int cMax = 0;
		for(int j = 0;j < size;j++) {		
			for(int k = 0;k < size;k++) {
				System.out.print(m[j][k] + " ");
				rSum += m[j][k];
				cSum += m[k][j];
			}
			if(rSum == rMax) {
				r.add(j);
			}else if(rSum > rMax) {
				rMax = rSum;
				r.clear();
				r.add(j);
			}
			if(cSum == cMax) {
				c.add(j);
			}else if(cSum > cMax) {
				cMax = cSum;
				c.clear();
				c.add(j);
			}
			//System.out.print(rMax + " " + cMax);
			System.out.println();
			rSum = 0;
			cSum = 0;
		}
		System.out.print("The largest row index: ");
		for(int i = 0;i < r.size();i++) {
			System.out.print(r.get(i)+ " ");
		}
		System.out.println();
		System.out.print("The largest column index: ");
		for(int i = 0;i < c.size();i++) {
			System.out.print(c.get(i)+ " ");
		}
		System.out.println();
		input.close();
	}

}
