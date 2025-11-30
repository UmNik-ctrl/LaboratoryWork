package timus;

import java.util.Scanner;

public class task_2100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int gostey = 2;

        for (int i = 0; i < n; i++) {
            String otvet = sc.nextLine();
            if (otvet.contains("+one")) {
                gostey += 2;
            } else {
                gostey += 1;
            }
        }

        if (gostey == 13) {
            gostey += 1;
        }

        int stoimost = gostey * 100;
        System.out.println(stoimost);

        sc.close();
    }
}