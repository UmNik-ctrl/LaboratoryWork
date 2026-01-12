package timus;

import java.util.HashSet;
import java.util.Scanner;

public class task_1880 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    set.add(sc.nextInt());
                }
            } else {
                HashSet<Integer> newSet = new HashSet<>();
                for (int j = 0; j < n; j++) {
                    int num = sc.nextInt();
                    if (set.contains(num)) {
                        newSet.add(num);
                    }
                }
                set = newSet;
            }
        }

        System.out.println(set.size());
        sc.close();
    }
}