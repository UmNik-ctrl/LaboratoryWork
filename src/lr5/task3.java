package lr5;

public class task3 {
    private int a;
    private int b;

    public task3() {
        a = 0;
        b = 0;
    }

    public task3(int x) {
        a = x;
        b = x;
    }

    public task3(int x, int y) {
        a = x;
        b = y;
    }

    public void printValues() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        task3 obj1 = new task3();
        task3 obj2 = new task3(5);
        task3 obj3 = new task3(3, 7);

        obj1.printValues();
        obj2.printValues();
        obj3.printValues();
    }
}