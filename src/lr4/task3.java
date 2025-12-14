package lr4;

public class task3 {
    public static void main(String[] args) {
        int[][] massiv = new int[5][9];
        int i;
        int j;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 9; j++) {
                massiv[i][j] = 2;
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
    }
}