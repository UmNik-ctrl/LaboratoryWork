package lr3;

public class task8 {
    public static void main(String[] args) {
        int razmer = 10;
        char[] bukvy = new char[razmer];


        String glasnye = "AEIOU";

        char tekBukva = 'A';
        int index = 0;


        while (index < razmer) {

            if (glasnye.indexOf(tekBukva) == -1) {

                bukvy[index] = tekBukva;
                index++;
            }
            tekBukva++;
        }

        System.out.println("Массив из 10 согласных букв:");
        for (int i = 0; i < razmer; i++) {
            System.out.print(bukvy[i] + " ");
        }
    }
}