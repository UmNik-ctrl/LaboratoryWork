package timus;

import java.util.Scanner;

public class task_1197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[][] moves = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};

        for (int i = 0; i < n; i++) {
            String pos = sc.nextLine();
            int x = pos.charAt(0) - 'a';
            int y = pos.charAt(1) - '1';

            int count = 0;
            for (int[] move : moves) {
                int nx = x + move[0];
                int ny = y + move[1];
                if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
                    count++;
                }
            }
            System.out.println(count);
        }

        sc.close();
    }
}