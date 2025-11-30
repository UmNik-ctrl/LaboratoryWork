package lr2;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = vvod.nextInt();

        boolean delitsya = (x % 4 == 0);
        boolean bolshe = (x >= 10);

        if (delitsya && bolshe) {
            System.out.println("Число подходит");
        } else {
            System.out.println("Число НЕ подходит");
        }

        vvod.close();
    }
}