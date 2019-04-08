package com.java.Oracle;

/**
 * Created by prasun.pallav on 12/21/2018.
 */
public class SpiralMatrix {
    public static void main(String args[]) {
        int row = 3;
        int col = 6;
        int a[][] = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        spiralPrint(row, col, a);
    }

    static void spiralPrint(int m, int n, int a[][]) {
        int i, k = 0, l = 0;
        // Print the first row from the remaining rows
        for (i = l; i < n; ++i) {
            System.out.print(a[k][i] + " ");
        }
        k++;
        // Print the last column from the remaining columns
        for (i = k; i < m; ++i) {
            System.out.print(a[i][n - 1] + " ");
        }
        n--;
        for (i = n - 1; i >= l; --i) {
            System.out.print(a[m - 1][i] + " ");
        }
        for (i = m - 2; i > l; --i) {
            System.out.print(a[i][l] + " ");
        }
        for (i = k; i < n; i++) {
            System.out.print(a[k][i] + " ");
        }
    }
}
