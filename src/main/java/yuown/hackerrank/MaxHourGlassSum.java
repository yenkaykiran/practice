package yuown.hackerrank;

import java.util.Scanner;

public class MaxHourGlassSum {
    static int OFF = 2;

    static int MAX = 6;

    static int max = -9 * (MAX + 1);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[MAX][MAX];
        for (int arr_i = 0; arr_i < MAX; arr_i++) {
            for (int arr_j = 0; arr_j < MAX; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        for (int i = 0; i < MAX - OFF; i++) {
            for (int j = 0; j < MAX - OFF; j++) {
                findMax(arr, i, j);
            }
        }
        System.out.println(max);
    }

    static void findMax(int arr[][], int i, int j) {
//        System.out.println("i = " + i + " and j = " + j);
        int tmp = 0;
        for (int k = j; k <= j + OFF; k++) {
            tmp += arr[i][k];
            tmp += arr[i + OFF][k];
        }
        tmp += arr[i + 1][j + 1];
        if (tmp > max) {
            max = tmp;
        }
    }
}
