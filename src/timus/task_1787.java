package timus;

import java.util.Scanner;

public class task_1787 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int probka = 0;

        for (int i = 0; i < n; i++) {
            int avto = sc.nextInt();
            probka = probka + avto;
            if (probka > k) {
                probka = probka - k;
            } else {
                probka = 0;
            }
        }

        System.out.println(probka);

        sc.close();
    }
}