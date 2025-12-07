package lr3;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int razmer = vvod.nextInt();

            if (razmer <= 0) {
                System.out.println("Ошибка: размер массива должен быть положительным числом");
                return;
            }

            int[] massiv = new int[razmer];

            for (int i = 0; i < razmer; i++) {
                massiv[i] = 2 + i * 5;
            }

            System.out.println("Созданный массив:");
            for (int i = 0; i < razmer; i++) {
                System.out.print(massiv[i] + " ");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение (требуется целое число)");
        } catch (java.lang.NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива не может быть отрицательным");
        } finally {
            vvod.close();
        }
    }
}