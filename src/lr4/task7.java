package lr4;

public class task7 {
    public static void main(String[] args) {
        int stroki = 5;
        int stolbcy = 7;
        int[][] massiv = new int[stroki][stolbcy];
        int chislo = 1;


        for (int i = 0; i < stroki; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < stolbcy; j++) {
                    massiv[i][j] = chislo;
                    chislo++;
                }
            } else {
                for (int j = stolbcy - 1; j >= 0; j--) {
                    massiv[i][j] = chislo;
                    chislo++;
                }
            }
        }


        System.out.println("Массив заполненный змейкой:");
        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < stolbcy; j++) {
                System.out.printf("%3d ", massiv[i][j]);
            }
            System.out.println();
        }
    }
}