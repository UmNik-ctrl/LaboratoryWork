package lr2;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = vvod.nextInt();

        if (x >= 5 && x <= 10) {
            System.out.println("Попадает в диапазон");
        } else {
            System.out.println("Не попадает в диапазон");
        }

        vvod.close();
    }
}