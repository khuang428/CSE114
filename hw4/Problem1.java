//Karen Huang
//111644515

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
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
		}
	}
	
	public static void main(String[] args) {
		File f = new File("integerFile.txt");
		boolean b;
		try {
			b = f.createNewFile();
		} catch (IOException e) {
			b = false;
		}
		if(b) {
			System.out.println("File created");
		}else {
			System.out.println("File already exists");
		}
		try {
			FileWriter fw = new FileWriter(f,false);
			PrintWriter pw = new PrintWriter(fw,true);
			for(int i = 0;i < 100;i++) {
				pw.print((int)(Math.random() * 100));
				pw.print(" ");
			}
			//System.out.println("Done writing");
			fw.close();
			pw.close();
			Scanner input = new Scanner(f);
			ArrayList<Integer> arr = new ArrayList<Integer>(100);
			for(int i = 0;i < 100;i++) {
				arr.add(input.nextInt());
			}
			sort(arr);
			for(int i = 0;i < 100;i++) {
				System.out.print(arr.get(i) + " ");
				//Just for good output formatting
				/*
				if((i+1) % 10 == 0 && i != 0) {
					System.out.println();
				}
				*/
			}
			input.close();
		}catch(IOException e) {
			System.out.println("File does not exist");
		}
	}

}
