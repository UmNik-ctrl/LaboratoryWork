package timus;

import java.util.Scanner;

public class task_1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long k = sc.nextLong();
            long t = (long) Math.sqrt(2 * (k - 1));
            if (t * (t + 1) / 2 == k - 1) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }

        System.out.println(result.toString().trim());
        sc.close();
    }
}