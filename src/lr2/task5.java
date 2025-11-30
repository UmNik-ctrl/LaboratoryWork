package lr2;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = vvod.nextInt();

        int tysyachi = (x / 1000) % 10;

        System.out.println("Тысяч в числе: " + tysyachi);

        vvod.close();
    }
}