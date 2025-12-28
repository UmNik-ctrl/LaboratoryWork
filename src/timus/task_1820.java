package timus;

import java.util.Scanner;

public class task_1820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n <= k) {
            System.out.println(2);
        } else {
            int minutes = (2 * n + k - 1) / k;
            System.out.println(minutes);
        }

        sc.close();
    }
}