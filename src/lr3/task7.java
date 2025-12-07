package lr3;

public class task7 {
    public static void main(String[] args) {
        int razmer = 10;
        char[] simvoly = new char[razmer];


        char tekushaya = 'a';
        for (int i = 0; i < razmer; i++) {
            simvoly[i] = tekushaya;
            tekushaya += 2;
        }

        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < razmer; i++) {
            System.out.print(simvoly[i] + " ");
        }
        System.out.println();

        System.out.println("Массив в обратном порядке:");
        for (int i = razmer - 1; i >= 0; i--) {
            System.out.print(simvoly[i] + " ");
        }
        System.out.println();
    }
}