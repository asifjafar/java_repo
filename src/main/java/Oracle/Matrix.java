package Oracle;

import java.util.Scanner;

/**
 * Created by prasun.pallav on 12/19/2018.
 */
public class Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows/columns in matrix : ");
        int row = sc.nextInt();
        int col = row;
        int sum = 0;
        int mat[][] = new int[row][col];
        System.out.println("Enter the elements in matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum = sum + mat[i][j];
                }
            }
        }
        System.out.println("sum of diagonal elements "+sum);
    }
}
