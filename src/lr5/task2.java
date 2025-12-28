package lr5;

public class task2 {
    private char start;
    private char end;

    public void setChars(char s, char e) {
        this.start = s;
        this.end = e;
    }

    public void printRange() {
        if (start < end) {
            for (char c = start; c <= end; c++) {
                System.out.print(c + " ");
            }
        } else {
            for (char c = start; c >= end; c--) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task2 obj = new task2();
        obj.setChars('A', 'D');
        obj.printRange();
    }
}