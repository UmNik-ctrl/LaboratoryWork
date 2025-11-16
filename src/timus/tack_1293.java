package timus;

import java.util.Scanner;

public class tack_1293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int totalSulfide = N * A * B * 2;

        System.out.println(totalSulfide);

        scanner.close();
    }
}
