package Oracle;

import java.util.Scanner;

/**
 * Created by prasun.pallav on 12/19/2018.
 */
public class SumOfBothDiagonals {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows/columns in matrix : ");
        int row = sc.nextInt();
        int col = row;
        int mat[][] = new int[row][col];
        System.out.println("Enter the elements in matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int d1 = 0;
        for (int i = 0, j = 0; i < row && j < col; i++, j++) {
            d1 = d1 + mat[i][j];
        }
        System.out.println("Sum of 1st Diagonal = " + d1);
        int d2 = 0;
        for (int i = 0, j = col - 1; i < row && j >= 0; i++, j--) {
            d2 = d2 + mat[i][j];
        }
        System.out.println("Sum of 2nd Diagonal = " + d2);
    }
}