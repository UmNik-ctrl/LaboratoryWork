package timus;

import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int garri = sc.nextInt();
        int lari = sc.nextInt();

        int vsegoBank = garri + lari - 1;

        int nePopalGarri = vsegoBank - garri;
        int nePopalLari = vsegoBank - lari;

        System.out.println(nePopalGarri + " " + nePopalLari);

        sc.close();
    }
}