import  helpers.LinePrinter;

public class Main {
    public static void main(String[] args) {
        LinePrinter pr = new LinePrinter();

        pr.eqLines(10);
        pr.print("This is a print from line printer");
    }
}