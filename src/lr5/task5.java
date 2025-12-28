package lr5;

public class task5 {
    private int value;

    public task5() {
        setValue();
    }

    public task5(int x) {
        setValue(x);
    }

    public void setValue() {
        value = 0;
    }

    public void setValue(int x) {
        if (x > 100) {
            value = 100;
        } else {
            value = x;
        }
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        task5 obj1 = new task5();
        task5 obj2 = new task5(50);
        task5 obj3 = new task5(150);

        System.out.println("obj1: " + obj1.getValue());
        System.out.println("obj2: " + obj2.getValue());
        System.out.println("obj3: " + obj3.getValue());
    }
}