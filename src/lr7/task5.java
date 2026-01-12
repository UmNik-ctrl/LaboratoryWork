package lr7;

public class task5 {
    private static class SuperClass5 {
        private String text;
        public SuperClass5(String text) { this.text = text; }
        public void displayInfo() { System.out.println("SuperClass5: text = " + text); }
    }

    private static class SubClass5_1 extends SuperClass5 {
        protected int number;
        public SubClass5_1(String text, int number) { super(text); this.number = number; }
        @Override public void displayInfo() { System.out.println("SubClass5_1: text = " + text + ", number = " + number); }
        private String text;
    }

    private static class SubClass5_2 extends SuperClass5 {
        protected char symbol;
        public SubClass5_2(String text, char symbol) { super(text); this.symbol = symbol; }
        @Override public void displayInfo() { System.out.println("SubClass5_2: text = " + text + ", symbol = " + symbol); }
        private String text;
    }

    public static void main(String[] args) {
        SuperClass5 superObj = new SuperClass5("Супер");
        SubClass5_1 subObj1 = new SubClass5_1("Подкласс1", 111);
        SubClass5_2 subObj2 = new SubClass5_2("Подкласс2", 'X');
        superObj.displayInfo();
        subObj1.displayInfo();
        subObj2.displayInfo();
    }
}