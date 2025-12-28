package lr5;

public class task1 {
    private char symbol;

    public void setSymbol(char s) {
        this.symbol = s;
    }

    public int getCode() {
        return (int) this.symbol;
    }

    public void printSymbolAndCode() {
        System.out.println("Символ: " + this.symbol + ", Код: " + getCode());
    }
}