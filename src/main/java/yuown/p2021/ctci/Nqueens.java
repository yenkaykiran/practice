package yuown.p2021.ctci;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {

	static int n = 4;

	List<List<String>> op = new ArrayList<>();
	
	public static void main(String[] args) {
		Nqueens nq = new Nqueens();
		nq.solveNQueens(n);
	}

	public List<List<String>> solveNQueens(int n) {
		char[][] board = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}
		System.out.println("Before");
		print(board);

		solve(board, 0);

		System.out.println("After");
		print(board);
		
		// for(int i = 0; i < board.length; )
		return op;
	}

	private void print(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private boolean isSafe(char[][] board, int row, int col) {
		for (int i = 0; i < col; i++) {
			if (board[row][i] == 'Q') {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}

		return true;
	}

	private boolean solve(char[][] board, int col) {
		if (col == board.length) {
			return true;
		}

		for (int i = 0; i < board.length; i++) {
			if (isSafe(board, i, col)) {
				board[i][col] = 'Q';
				if(solve(board, col + 1)) {
					return true;
				}
				board[i][col] = '.';
			}
		}
		return false;
	}
}
