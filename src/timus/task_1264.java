package timus;

import java.util.Scanner;

public class task_1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();

        long result = N * (M + 1);

        System.out.println(result);

        sc.close();
    }
}