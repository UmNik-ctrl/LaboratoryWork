package lr7;

public class task4 {
    private static class CharClass {
        public char ch;
        public CharClass(char ch) { this.ch = ch; }
        public CharClass(CharClass obj) { this.ch = obj.ch; }
    }

    private static class TextClass extends CharClass {
        public String text;
        public TextClass(char ch, String text) { super(ch); this.text = text; }
        public TextClass(TextClass obj) { super(obj.ch); this.text = obj.text; }
    }

    private static class IntClass extends TextClass {
        public int num;
        public IntClass(char ch, String text, int num) { super(ch, text); this.num = num; }
        public IntClass(IntClass obj) { super(obj.ch, obj.text); this.num = obj.num; }
    }

    public static void main(String[] args) {
        CharClass charObj = new CharClass('A');
        TextClass textObj = new TextClass('B', "Hello");
        IntClass intObj = new IntClass('C', "World", 100);
        System.out.println("charObj: ch = " + charObj.ch);
        System.out.println("textObj: ch = " + textObj.ch + ", text = " + textObj.text);
        System.out.println("intObj: ch = " + intObj.ch + ", text = " + intObj.text + ", num = " + intObj.num);
    }
}