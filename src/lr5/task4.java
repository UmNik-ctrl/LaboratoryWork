package lr5;

public class task4 {
    private char symbol;
    private int number;

    public task4(int n, char s) {
        number = n;
        symbol = s;
    }

    public task4(double d) {
        symbol = (char)((int)d);
        number = (int)((d - (int)d) * 100);
    }

    public void printFields() {
        System.out.println("Символ: '" + symbol + "' (код " + (int)symbol +
                "), Число: " + number);
    }

    public static void main(String[] args) {
        task4 obj1 = new task4(10, 'B');
        task4 obj2 = new task4(65.1267);

        obj1.printFields();
        obj2.printFields();
    }
}