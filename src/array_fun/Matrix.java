package array_fun;

import java.util.Scanner;

public class Matrix {
	
	Scanner kbd = new Scanner(System.in);
	Boolean end = false;
	
	private int[][] ticTacToe = {
			{00,01,02},
			{10,11,12},
			{20,21,22}
		};

	private int[][] game = {
			{0,0,0},
			{0,1,0},
			{0,0,0}
		};
	
	private char[][] realGame = {
			{'-','-','-'},
			{'-','-','-'},
			{'-','-','-'}
		};
	
	//example
	String[][] checkers = new String[8][8];
	
	public void test2D() {
		
		//example
		checkers[0][0]="red";
		checkers[0][7]="red king";
		checkers[3][4]=" ";
		checkers[7][0]="black";
		checkers[7][7]="black king";
		
		System.out.println("\nTest of 2D array\n");
		
		for (int row = 0; row < ticTacToe.length; row++) {
			for (int col = 0; col < ticTacToe[0].length; col++) {
		
			System.out.println("test ticTacoToe["+row+"]["+col+"] = "+ ticTacToe[row][col]);
			
			}
			System.out.println();
		}
		
		System.out.println("\nPrint as 3 x 3\n");
		
		for (int row = 0; row < ticTacToe.length; row++) {
			for (int col = 0; col < ticTacToe[0].length; col++) {
		
			System.out.print(ticTacToe[row][col]+" ");
			
			}
			System.out.println();
		}
	} //end of test2D
	
	public void gameBoard() {
		System.out.println("\nPrint initial game board, player starts in middle\n");
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col < game[0].length; col++) {
		
			System.out.print(game[row][col]+" ");
			
			}
			System.out.println();
		}
		System.out.println("\nNow set row 0 col 0 to 1, print again\n");
		game[0][0] = 1;
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col < game[0].length; col++) {
		
			System.out.print(game[row][col]+" ");
			
			}
			System.out.println();
		}
		System.out.println("\nNow set row 2 col 2 to 1, print again\n");
		game[2][2] = 1;
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col < game[0].length; col++) {
		
			System.out.print(game[row][col]+" ");
			
			}
			System.out.println();
		}
		
		System.out.println("\nNow work with real game X and O\n");
		realGame[1][1] = 'X';
		realGame[2][2] = 'O';
		realGame[0][1] = 'X';
		for (int row = 0; row < realGame.length; row++) {
			for (int col = 0; col < realGame[0].length; col++) {
		
			System.out.print(realGame[row][col]+" ");
			
			}
			System.out.println();
		}
		//////////////////END OF TESTING/////////////////////
		realGame[1][1] = '-';
		realGame[1][2] = '-';
		realGame[1][0] = '-';
		realGame[2][0] = '-';
		realGame[2][2] = '-';
		realGame[2][1] = '-';
		realGame[0][2] = '-';
		realGame[0][0] = '-';
		realGame[0][1] = '-';
		System.out.println();
		for (int row = 0; row < realGame.length; row++) {
			for (int col = 0; col < realGame[0].length; col++) {
		
			System.out.print(realGame[row][col]+" ");
			
			}
			System.out.println();
		}
		while (end == false) {
		System.out.println("X player: please choose a row");
		int xRow = kbd.nextInt();
		System.out.println("X player: please choose a col");
		int xCol = kbd.nextInt();
		realGame[xRow][xCol] = 'X';
		for (int row = 0; row < realGame.length; row++) {
			for (int col = 0; col < realGame[0].length; col++) {
		
			System.out.print(realGame[row][col]+" ");
			
			}
			System.out.println();
		}
		if (realGame[0][0]==realGame[0][1]&&realGame[0][0]==realGame[0][2]&&realGame[0][0]=='X') {
			System.out.println("X player wins!");
			end = true;
		}else if (realGame[1][0]==realGame[1][1]&&realGame[1][0]==realGame[1][2]&&realGame[1][0]=='X') {
			System.out.println("X player wins!");
			end = true;
		}else if (realGame[2][0]==realGame[2][1]&&realGame[2][0]==realGame[2][2]&&realGame[2][0]=='X') {
			System.out.println("X player wins!");
			end = true;
		}else if (realGame[0][0]==realGame[1][0]&&realGame[0][0]==realGame[2][0]&&realGame[0][0]=='X') {
			System.out.println("X player wins!");
			end = true;
		}else if (realGame[0][1]==realGame[1][1]&&realGame[0][1]==realGame[2][1]&&realGame[0][1]=='X') {
			System.out.println("X player wins!");
			end = true;
		}else if (realGame[0][2]==realGame[1][2]&&realGame[0][2]==realGame[2][2]&&realGame[0][2]=='X') {
			System.out.println("X player wins!");
			end = true;
		}else if (realGame[0][0]==realGame[1][1]&&realGame[0][0]==realGame[2][2]&&realGame[0][0]=='X') {
			System.out.println("X player wins!");
			end = true;
		}else if (realGame[0][2]==realGame[1][1]&&realGame[0][2]==realGame[2][0]&&realGame[0][2]=='X') {
			System.out.println("X player wins!");
			end = true;
		}else if (realGame[0][0]!='-'&&realGame[0][1]!='-'&&realGame[0][2]!='-'&&realGame[1][0]!='-'&&realGame[1][1]!='-'&&realGame[1][2]!='-'&&realGame[2][0]!='-'&&realGame[2][1]!='-'&&realGame[2][2]!='-') {
			System.out.println("No winner, the game is a tie!");
			end = true;
		}else {
			System.out.println("No winner yet!");
		}
		System.out.println("O player: please choose a row");
		int oRow = kbd.nextInt();
		System.out.println("O player: please choose a col");
		int oCol = kbd.nextInt();
		realGame[oRow][oCol] = 'O';
		for (int row = 0; row < realGame.length; row++) {
			for (int col = 0; col < realGame[0].length; col++) {
		
			System.out.print(realGame[row][col]+" ");
			
			}
			System.out.println();
		}
		if (realGame[0][0]==realGame[0][1]&&realGame[0][0]==realGame[0][2]&&realGame[0][0]=='O') {
			System.out.println("O player wins!");
			end = true;
		}else if (realGame[1][0]==realGame[1][1]&&realGame[1][0]==realGame[1][2]&&realGame[1][0]=='O') {
			System.out.println("O player wins!");
			end = true;
		}else if (realGame[2][0]==realGame[2][1]&&realGame[2][0]==realGame[2][2]&&realGame[2][0]=='O') {
			System.out.println("O player wins!");
			end = true;
		}else if (realGame[0][0]==realGame[1][0]&&realGame[0][0]==realGame[2][0]&&realGame[0][0]=='O') {
			System.out.println("O player wins!");
			end = true;
		}else if (realGame[0][1]==realGame[1][1]&&realGame[0][1]==realGame[2][1]&&realGame[0][1]=='O') {
			System.out.println("O player wins!");
			end = true;
		}else if (realGame[0][2]==realGame[1][2]&&realGame[0][2]==realGame[2][2]&&realGame[0][2]=='O') {
			System.out.println("O player wins!");
			end = true;
		}else if (realGame[0][0]==realGame[1][1]&&realGame[0][0]==realGame[2][2]&&realGame[0][0]=='O') {
			System.out.println("O player wins!");
			end = true;
		}else if (realGame[0][2]==realGame[1][1]&&realGame[0][2]==realGame[2][0]&&realGame[0][2]=='O') {
			System.out.println("O player wins!");
			end = true;
		}else if (realGame[0][0]!='-'&&realGame[0][1]!='-'&&realGame[0][2]!='-'&&realGame[1][0]!='-'&&realGame[1][1]!='-'&&realGame[1][2]!='-'&&realGame[2][0]!='-'&&realGame[2][1]!='-'&&realGame[2][2]!='-') {
			System.out.println("No winner, the game is a tie!");
			end = true;
		}else {
			System.out.println("No winner yet!");
		}
		} //end of while loop
	} //end of gameBoard

} //end of Matrix class
