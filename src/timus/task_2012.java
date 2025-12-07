package timus;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();

        if (f >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}