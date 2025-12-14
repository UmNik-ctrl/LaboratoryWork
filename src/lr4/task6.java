package lr4;
import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        int stroki = 5;
        int stolbcy = 5;
        int[][] massiv = new int[stroki][stolbcy];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < stolbcy; j++) {
                massiv[i][j] = random.nextInt(10);
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }

        int udalitStroku = random.nextInt(stroki);
        int udalitStolbec = random.nextInt(stolbcy);

        System.out.println("\nУдаляем строку " + (udalitStroku + 1) +
                " и столбец " + (udalitStolbec + 1));

        int[][] noviyMassiv = new int[stroki - 1][stolbcy - 1];
        int novayaStroka = 0;

        for (int i = 0; i < stroki; i++) {
            if (i == udalitStroku) continue;
            int noviyStolbec = 0;
            for (int j = 0; j < stolbcy; j++) {
                if (j == udalitStolbec) continue;
                noviyMassiv[novayaStroka][noviyStolbec] = massiv[i][j];
                noviyStolbec++;
            }
            novayaStroka++;
        }

        System.out.println("\nНовый массив:");
        for (int i = 0; i < stroki - 1; i++) {
            for (int j = 0; j < stolbcy - 1; j++) {
                System.out.print(noviyMassiv[i][j] + " ");
            }
            System.out.println();
        }
    }
}