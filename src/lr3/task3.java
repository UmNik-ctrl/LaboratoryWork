package lr3;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Сколько чисел Фибоначчи вывести? ");
        int n = vvod.nextInt();

        if (n <= 0) {
            System.out.println("Некорректное количество");
            return;
        }

        System.out.println("\nЧерез for:");
        fibFor(n);

        System.out.println("\nЧерез while:");
        fibWhile(n);

        System.out.println("\nЧерез do-while:");
        fibDoWhile(n);

        vvod.close();
    }

    static void fibFor(int n) {
        int perv = 1, vtor = 1;
        if (n >= 1) System.out.print(perv);
        if (n >= 2) System.out.print(" " + vtor);

        for (int i = 3; i <= n; i++) {
            int sled = perv + vtor;
            System.out.print(" " + sled);
            perv = vtor;
            vtor = sled;
        }
        System.out.println();
    }

    static void fibWhile(int n) {
        int perv = 1, vtor = 1;
        if (n >= 1) System.out.print(perv);
        if (n >= 2) System.out.print(" " + vtor);

        int i = 3;
        while (i <= n) {
            int sled = perv + vtor;
            System.out.print(" " + sled);
            perv = vtor;
            vtor = sled;
            i++;
        }
        System.out.println();
    }

    static void fibDoWhile(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (n == 2) {
            System.out.println("1 1");
            return;
        }

        int perv = 1, vtor = 1;
        System.out.print("1 1");
        int i = 3;
        do {
            int sled = perv + vtor;
            System.out.print(" " + sled);
            perv = vtor;
            vtor = sled;
            i++;
        } while (i <= n);
        System.out.println();
    }
}