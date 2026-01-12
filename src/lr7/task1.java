package lr7;

public class task1 {
    private static class SuperClass1 {
        private String text;
        public SuperClass1(String text) { this.text = text; }
        @Override public String toString() { return "SuperClass1: text = " + text; }
    }

    private static class SubClass1 extends SuperClass1 {
        private String subText;
        public SubClass1(String text) { super(text); }
        public SubClass1(String text, String subText) { super(text); this.subText = subText; }
        @Override public String toString() {
            return "SubClass1: text = " + super.toString().split(" = ")[1] + ", subText = " + subText;
        }
    }

    public static void main(String[] args) {
        SuperClass1 superObj = new SuperClass1("Привет");
        SubClass1 subObj1 = new SubClass1("Мир");
        SubClass1 subObj2 = new SubClass1("Здравствуй", "Вселенная");
        System.out.println(superObj);
        System.out.println(subObj1);
        System.out.println(subObj2);
    }
}