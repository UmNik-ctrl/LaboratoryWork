package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input birth year: ");
        int birthYear = in.nextInt();

        int currentYear = 2025;
        int age = currentYear - birthYear;

        System.out.println("Your age: " + age);

        in.close();
    }
}