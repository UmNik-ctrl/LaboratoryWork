package timus;

import java.util.Scanner;

public class task_1493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ticket = sc.nextLine();

        int current = Integer.parseInt(ticket);
        int prev = current - 1;
        int next = current + 1;

        String prevStr = String.format("%06d", prev);
        String nextStr = String.format("%06d", next);

        int sumPrev1 = Integer.parseInt(prevStr.substring(0, 1)) +
                Integer.parseInt(prevStr.substring(1, 2)) +
                Integer.parseInt(prevStr.substring(2, 3));
        int sumPrev2 = Integer.parseInt(prevStr.substring(3, 4)) +
                Integer.parseInt(prevStr.substring(4, 5)) +
                Integer.parseInt(prevStr.substring(5, 6));

        int sumNext1 = Integer.parseInt(nextStr.substring(0, 1)) +
                Integer.parseInt(nextStr.substring(1, 2)) +
                Integer.parseInt(nextStr.substring(2, 3));
        int sumNext2 = Integer.parseInt(nextStr.substring(3, 4)) +
                Integer.parseInt(nextStr.substring(4, 5)) +
                Integer.parseInt(nextStr.substring(5, 6));

        if (sumPrev1 == sumPrev2 || sumNext1 == sumNext2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}