package lr3;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = vvod.nextInt();
        System.out.print("Введите второе число: ");
        int b = vvod.nextInt();

        int min, max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        System.out.println("\nЧерез for:");
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nЧерез while:");
        int i = min;
        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.println("\nЧерез do-while:");
        int j = min;
        if (j <= max) {
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= max);
        }
        System.out.println();

        vvod.close();
    }
}