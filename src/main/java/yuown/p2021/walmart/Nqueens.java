package yuown.p2021.walmart;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {
	
	List<List<String>> result = new ArrayList<>();
	
	public static void main(String[] args) {
		int n = 4;
		char[][] board = prepareBoard(n);
		
		System.out.println("Before");
		print(board, n);
		
		solve(board, 0, n);
		
		System.out.println("After");
		print(board, n);
	}

	private static void print(char[][] board, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static boolean solve(char[][] board, int col, int n) {
		if(col == n) {
			System.out.println("----------- " + col);
			print(board, n);
			System.out.println("----------- " + col);
			return true;
		}
		
		for(int i = 0; i < n; i++) {
			if(isSafe(board, i, col, n)) {
				board[i][col] = 'Q';
				if(solve(board, col + 1, n)) {
					return true;
				}
				board[i][col] = '.';
			}
		}
		return false;
	}

	private static boolean isSafe(char[][] board, int row, int col, int n) {
		for(int i = 0; i < col; i++) {
			if(board[row][i] == 'Q') {
				return false;
			}
		}
		for(int i = row, j = col; i >=0 && j >= 0; i--, j--) {
			if(board[i][j] == 'Q') {
				return false;
			}
		}
		for(int i = row, j = col; i < n && j >= 0; i++, j--) {
			if(board[i][j] == 'Q') {
				return false;
			}
		}
		return true;
	}

	private static char[][] prepareBoard(int n) {
		char[][] board = new char[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}
		return board;
	}

}
