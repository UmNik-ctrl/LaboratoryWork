package lr3;

import java.util.Random;

public class task9 {
    public static void main(String[] args) {

        int razmer = 15;
        int[] chisla = new int[razmer];

        Random rand = new Random();


        for (int i = 0; i < razmer; i++) {
            chisla[i] = rand.nextInt(101);
        }


        System.out.println("Созданный массив:");
        for (int i = 0; i < razmer; i++) {
            System.out.print(chisla[i] + " ");
        }
        System.out.println();


        int min = chisla[0];
        for (int i = 1; i < razmer; i++) {
            if (chisla[i] < min) {
                min = chisla[i];
            }
        }


        System.out.println("Минимальное значение: " + min);


        System.out.print("Индексы элементов с минимальным значением: ");
        for (int i = 0; i < razmer; i++) {
            if (chisla[i] == min) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}