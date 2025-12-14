package lr4;

public class task4 {
    public static void main(String[] args) {
        int[][] massiv = new int[5][];

        for (int i = 0; i < 5; i++) {
            massiv[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                massiv[i][j] = 2;
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
    }
}