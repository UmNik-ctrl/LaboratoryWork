package lr6;

public class task1 {
    private char symbol;
    private String text;

    public void setValue(char c) {
        symbol = c;
    }

    public void setValue(String s) {
        text = s;
    }

    public void setValue(char[] arr) {
        if (arr.length == 1) {
            symbol = arr[0];
        } else {
            text = new String(arr);
        }
    }

    public void printValues() {
        System.out.println("Символ: " + symbol);
        System.out.println("Текст: " + text);
    }
}