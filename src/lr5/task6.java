package lr5;

public class task6 {
    private int max;
    private int min;

    public task6(int a, int b) {
        setValues(a, b);
    }

    public task6(int a) {
        setValues(a);
    }

    public void setValues(int a, int b) {
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
    }

    public void setValues(int a) {
        if (a > max) {
            max = a;
        } else if (a < min) {
            min = a;
        }
    }

    public void printValues() {
        System.out.println("max = " + max + ", min = " + min);
    }

    public static void main(String[] args) {
        task6 obj1 = new task6(5, 10);
        task6 obj2 = new task6(20);

        obj1.printValues();
        obj2.setValues(15);
        obj2.printValues();
    }
}