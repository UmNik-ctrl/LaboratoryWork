package lr3;

import java.util.Arrays;
import java.util.Random;

public class task10 {
    public static void main(String[] args) {

        int razmer = 10;
        int[] chisla = new int[razmer];

        Random rand = new Random();


        System.out.println("Исходный массив:");
        for (int i = 0; i < razmer; i++) {
            chisla[i] = rand.nextInt(101);
            System.out.print(chisla[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < razmer - 1; i++) {
            for (int j = 0; j < razmer - i - 1; j++) {
                if (chisla[j] < chisla[j + 1]) {

                    int temp = chisla[j];
                    chisla[j] = chisla[j + 1];
                    chisla[j + 1] = temp;
                }
            }
        }


        System.out.println("Массив после сортировки (по убыванию):");
        for (int i = 0; i < razmer; i++) {
            System.out.print(chisla[i] + " ");
        }
        System.out.println();
    }
}