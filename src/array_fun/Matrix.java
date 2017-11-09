package array_fun;

public class Matrix {
	
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
		
	} //end of gameBoard

} //end of Matrix class
