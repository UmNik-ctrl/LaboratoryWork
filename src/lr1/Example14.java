package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int num = in.nextInt();

        int numMinusOne = num - 1;
        int numPlusOne = num + 1;
        int sumFirstThree = numMinusOne + num + numPlusOne;
        int fourthNumber = sumFirstThree * sumFirstThree;

        System.out.println("Sequence: " + numMinusOne + ", " + num + ", " + numPlusOne + ", " + fourthNumber);

        in.close();
    }
}