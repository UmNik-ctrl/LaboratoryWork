package lr3;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.print("Введите количество чисел для суммирования: ");
        int n = vvod.nextInt();

        if (n <= 0) {
            System.out.println("Некорректное количество");
            vvod.close();
            return;
        }

        System.out.println("\n=== Решение через for ===");
        int count = 0;
        int sum = 0;
        int chislo = 1;

        for (; count < n; chislo++) {
            if (chislo % 5 == 2 || chislo % 3 == 1) {
                System.out.print(chislo + " ");
                sum += chislo;
                count++;
            }
        }
        System.out.println("\nСумма: " + sum);

        System.out.println("\n=== Решение через while ===");
        count = 0;
        sum = 0;
        chislo = 1;

        while (count < n) {
            if (chislo % 5 == 2 || chislo % 3 == 1) {
                System.out.print(chislo + " ");
                sum += chislo;
                count++;
            }
            chislo++;
        }
        System.out.println("\nСумма: " + sum);

        System.out.println("\n=== Решение через do-while ===");
        count = 0;
        sum = 0;
        chislo = 1;

        if (n > 0) {
            do {
                if (chislo % 5 == 2 || chislo % 3 == 1) {
                    System.out.print(chislo + " ");
                    sum += chislo;
                    count++;
                }
                chislo++;
            } while (count < n);
        }
        System.out.println("\nСумма: " + sum);

        vvod.close();
    }
}