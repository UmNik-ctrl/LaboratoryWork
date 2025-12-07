package lr3;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String den = vvod.nextLine().toLowerCase();


        System.out.print("(if-else) ");
        if (den.equals("понедельник")) {
            System.out.println("1");
        } else if (den.equals("вторник")) {
            System.out.println("2");
        } else if (den.equals("среда")) {
            System.out.println("3");
        } else if (den.equals("четверг")) {
            System.out.println("4");
        } else if (den.equals("пятница")) {
            System.out.println("5");
        } else if (den.equals("суббота")) {
            System.out.println("6");
        } else if (den.equals("воскресенье")) {
            System.out.println("7");
        } else {
            System.out.println("Такого дня нет");
        }

        System.out.print("(switch) ");
        switch (den) {
            case "понедельник":
                System.out.println("1");
                break;
            case "вторник":
                System.out.println("2");
                break;
            case "среда":
                System.out.println("3");
                break;
            case "четверг":
                System.out.println("4");
                break;
            case "пятница":
                System.out.println("5");
                break;
            case "суббота":
                System.out.println("6");
                break;
            case "воскресенье":
                System.out.println("7");
                break;
            default:
                System.out.println("Такого дня нет");
        }

        vvod.close();
    }
}