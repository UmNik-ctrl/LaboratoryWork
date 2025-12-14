package lr4;
import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        int stroki = 3;
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

        int[][] transponirovanniy = new int[stolbcy][stroki];

        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < stolbcy; j++) {
                transponirovanniy[j][i] = massiv[i][j];
            }
        }

        System.out.println("\nТранспонированный массив:");
        for (int i = 0; i < stolbcy; i++) {
            for (int j = 0; j < stroki; j++) {
                System.out.print(transponirovanniy[i][j] + " ");
            }
            System.out.println();
        }
    }
}