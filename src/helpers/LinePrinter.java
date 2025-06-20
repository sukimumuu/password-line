package helpers;

public class LinePrinter {
//    This is used for printing general text, similar to a basic System.out.println.
    public void print(String line) {
        System.out.println(line);
    }

//    This is user for printing equals line ( === ...)
    public void eqLines(int lines) {
        System.out.println("=".repeat(lines));
    }
}
