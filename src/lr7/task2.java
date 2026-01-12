package lr7;

public class task2 {
    private static class SuperClass2 {
        private String text;
        public SuperClass2(String text) { this.text = text; }
        public void setValue(String text) { this.text = text; }
        public int getLength() { return text.length(); }
    }

    private static class SubClass2 extends SuperClass2 {
        public int number;
        public SubClass2(int number, String text) { super(text); this.number = number; }
        public void setValue() { setValue(""); number = 0; }
        @Override public void setValue(String text) { super.setValue(text); }
        public void setValue(int number) { this.number = number; }
        public void setValue(String text, int number) { setValue(text); this.number = number; }
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(10, "Java");
        System.out.println("Длина: " + obj.getLength());
        obj.setValue(20);
        System.out.println("Число: " + obj.number);
        obj.setValue("Hello", 30);
        System.out.println("После изменений: число = " + obj.number + ", длина = " + obj.getLength());
    }
}