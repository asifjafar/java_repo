package leetcode;

/**
 * Created by User on 29-08-2020.
 */
public class Searching2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        long before = System.nanoTime();
        boolean result = searchMatrix(matrix, 5);
        long after = System.nanoTime();
        System.out.println("time taken: " + (after - before));
        System.out.println(result);

    }

    private static boolean searchMatrix(int[][] matrix, int target) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;

        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int x = 0;
        int y = matrix[0].length - 1;

        while (x < matrix.length && y >= 0) {
            int temp = matrix[x][y];
            if (temp == target) return true;
            else if (temp > target) {
                y--;
            } else {
                x++;
            }
        }
        return false;
    }

}
