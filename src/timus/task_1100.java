package timus;

import java.util.Scanner;

public class task_1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ids = new int[n];
        int[] scores = new int[n];
        int[] order = new int[n];

        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
            scores[i] = sc.nextInt();
            order[i] = i;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (scores[order[j]] < scores[order[j + 1]]) {
                    int temp = order[j];
                    order[j] = order[j + 1];
                    order[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ids[order[i]] + " " + scores[order[i]]);
        }

        sc.close();
    }
}