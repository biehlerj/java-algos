package leetcode_array;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        rotate(matrix1);
        rotate(matrix2);

        System.out.println(Arrays.toString(matrix1));
        System.out.println(Arrays.toString(matrix2));
    }

    private static void rotate(int[][] matrix) {
        for (int start = 0, end = matrix.length - 1; start < end; start++, end--) {
            for (int s = start, e = end; s < end; s++, e--) {
                int tmp = matrix[start][s];
                matrix[start][s] = matrix[e][start];
                matrix[e][start] = matrix[end][e];
                matrix[end][e] = matrix[s][end];
                matrix[s][end] = tmp;
            }
        }
    }
}
