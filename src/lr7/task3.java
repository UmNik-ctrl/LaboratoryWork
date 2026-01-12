package lr7;

public class task3 {
    private static class ClassA {
        public int a;
        public ClassA(int a) { this.a = a; }
        public void setValue(int a) { this.a = a; }
        @Override public String toString() { return "ClassA: a = " + a; }
    }

    private static class ClassB extends ClassA {
        public char b;
        public ClassB(int a, char b) { super(a); this.b = b; }
        public void setValue(int a, char b) { super.setValue(a); this.b = b; }
        @Override public String toString() { return "ClassB: a = " + a + ", b = " + b; }
    }

    private static class ClassC extends ClassB {
        public String c;
        public ClassC(int a, char b, String c) { super(a, b); this.c = c; }
        public void setValue(int a, char b, String c) { super.setValue(a, b); this.c = c; }
        @Override public String toString() { return "ClassC: a = " + a + ", b = " + b + ", c = " + c; }
    }

    public static void main(String[] args) {
        ClassA objA = new ClassA(1);
        ClassB objB = new ClassB(2, 'B');
        ClassC objC = new ClassC(3, 'C', "Text");
        System.out.println(objA);
        System.out.println(objB);
        System.out.println(objC);
    }
}