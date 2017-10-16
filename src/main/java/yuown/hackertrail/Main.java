package yuown.hackertrail;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// note:
		// this is just an example on how our system
		// takes input and output and automate the process
		// of marking this submission
		try {
			Scanner scan = new Scanner(System.in);

			// check if there is any more line
			if (scan.hasNextLine()) {
				// here's how you read the next line
				String string = scan.nextLine();
				String[] xy = string.split(" ");
				int x = Integer.parseInt(xy[0]);
				int y = Integer.parseInt(xy[1]);

				int[][] heights = new int[x][y];

				for (int i = 0; i < heights.length; i++) {
					String line = scan.nextLine();
					String[] lineArray = line.split(" ");
					for (int j = 0; j < heights[i].length; j++) {
						heights[i][j] = Integer.parseInt(lineArray[j]);
					}
				}
				
//				for (int i = 0; i < heights.length; i++) {
//					for (int j = 0; j < heights[i].length; j++) {
//						System.out.print(heights[i][j] + " ");
//					}
//					System.out.println();
//				}
				
				
				
			}
		} catch (Exception e) {
		}
	}
	
	void start(int[][] heights, int longestPath, int dropSize) {
		
	}
}