package lr2;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = vvod.nextInt();

        boolean uslovie1 = (x % 5 == 2);
        boolean uslovie2 = (x % 7 == 1);

        if (uslovie1 && uslovie2) {
            System.out.println("Число подходит");
        } else {
            System.out.println("Число НЕ подходит");
        }

        vvod.close();
    }
}