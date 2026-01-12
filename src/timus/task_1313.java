package timus;

import java.util.Scanner;

public class task_1313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        StringBuilder result = new StringBuilder();

        for (int d = 0; d < 2 * n - 1; d++) {
            int startRow = Math.min(d, n - 1);
            int startCol = d - startRow;

            while (startRow >= 0 && startCol < n) {
                result.append(matrix[startRow][startCol]).append(" ");
                startRow--;
                startCol++;
            }
        }

        System.out.println(result.toString().trim());
        sc.close();
    }
}