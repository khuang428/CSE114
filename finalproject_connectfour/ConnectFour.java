//Karen Huang
//111644515

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConnectFour {
	private char[][] board = new char[6][7];
	private int turn = 0;
	
	public void nextTurn() {
		turn++;
	}
	
	public void printBoard() {
		System.out.print("|");
		for(int i = 0;i < 7;i++) {
			System.out.print(i + "|");
		}
		System.out.println();
		for(int i = 0;i < 6;i++) {
			System.out.print("|");
			for(int j = 0;j < 7;j++) {
				System.out.print(board[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	private boolean vertWin(int[]a) {
		char init = board[a[0]][a[1]];;
		for(int i = 0;i < 4;i++) {
			if(board[a[0] + i][a[1]] != init) {
				return false;
			}
		}
		return true;
	}
	
	private boolean horWin(int[]a) {
		char init = board[a[0]][a[1]];
		for(int i = 0;i < 4;i++) {
			if(board[a[0]][a[1] + i] != init) {
				return false;
			}
		}
		return true;
	}
	
	private boolean diagRWin(int[]a) {
		char init = board[a[0]][a[1]];
		for(int i = 0;i < 4;i++) {
			if(board[a[0] + i][a[1] + i] != init) {
				return false;
			}
		}
		return true;
	}
	
	private boolean diagLWin(int[]a) {
		char init = board[a[0]][a[1]];
		for(int i = 0;i < 4;i++) {
			if(board[a[0] + i][a[1] - i] != init) {
				return false;
			}
		}
		return true;
	}
	
	//Checks if there is a winner: R -> 0, Y -> 1, no winner -> -1
	public int winner() {
		//vertical check top 3
		int[]a = new int[2];
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 7;j++) {
				if(board[i][j] != 0) {
					a[0] = i;
					a[1] = j;
					if(vertWin(a)) {
						return (turn+1) % 2;
					}
				}
			}
		}
		//horizontal check left 4
		for(int i = 0;i < 6;i++) {
			for(int j = 0;j < 4;j++) {
				if(board[i][j] != 0) {
					a[0] = i;
					a[1] = j;
					if(horWin(a)) {
						return (turn+1) % 2;
					}
				}
			}
		}
		//diagonal slanting right just check top 3,left 4
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 4;j++) {
				if(board[i][j] != 0) {
					a[0] = i;
					a[1] = j;
					if(diagRWin(a)) {
						return (turn+1) % 2;
					}
				}	
			}
		}
		//diagonal slanting left just check top 3, right 4
		for(int i = 0;i < 3;i++) {
			for(int j = 3;j < 7;j++) {
				if(board[i][j] != 0) {
					a[0] = i;
					a[1] = j;
					if(diagLWin(a)) {
						return (turn+1) % 2;
					}
				}
			}
		}
		return -1;
	}
	
	public int bottomRow(int c) {
		for(int i = 5;i >= 0;i--) {
			if(board[i][c] == 0) {
				return i;
			}
		}
		return -1;
	}
	
	//tries dropping disk, checks if column is full or out of bounds
	public void dropDisk (int c) throws IllegalArgumentException{
		if(c < 0 || c > 6) {
			throw new IllegalArgumentException("Enter a column(0-6)");
		}else if(bottomRow(c) == -1) {
			throw new IllegalArgumentException("Column is full, enter another column(0-6)");
		}else if(turn % 2 == 0){
			board[bottomRow(c)][c] = 'R';
		}else if(turn % 1 == 0) {
			board[bottomRow(c)][c] = 'Y';
		}
	}
	
	//game over if full board
	public boolean fullBoard() {
		for(int i = 0;i < 7;i++) {
			if(bottomRow(i) != -1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ConnectFour b = new ConnectFour();
		while(b.winner() == -1) {
			b.printBoard();
			if(b.fullBoard()) {
				System.out.println("----------------------------------");
				System.out.println("Game over.");
				input.close();
				return;
			}
			System.out.println("----------------------------------");
			if(b.turn % 2 == 0) {
				System.out.print("Drop a red disk at column(0-6): ");
				try {
					b.dropDisk(input.nextInt());
					b.nextTurn();
				}catch(IllegalArgumentException e) {
					System.out.println();
					System.out.println(e.getMessage());
					System.out.println("----------------------------------");
				}catch(InputMismatchException e) {
					System.out.println();
					input.next();
					System.out.println("Enter a column(0-6)");
					System.out.println("----------------------------------");
				}
			}else {
				System.out.print("Drop a yellow disk at column(0-6): ");
				try {
					b.dropDisk(input.nextInt());
					b.nextTurn();
				}catch(IllegalArgumentException e) {
					System.out.println();
					System.out.println(e.getMessage());
					System.out.println("----------------------------------");
				}catch(InputMismatchException e) {
					System.out.println();
					input.next();
					System.out.println("Enter a column(0-6)");
					System.out.println("----------------------------------");
				}
			}
		}
		b.printBoard();
		System.out.println("----------------------------------");
		if(b.winner() == 0) {
			System.out.println("The red player won.");
		}else if(b.winner() == 1) {
			System.out.println("The yellow player won.");
		}
		input.close();
	}
}
