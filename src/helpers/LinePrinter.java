package helpers;

public class LinePrinter {
    public int lenTitleLine;

//    This is used for printing general text, similar to a basic System.out.println.
    public void print(String line) {
        System.out.println(line);
    }

//    This is user for printing equals line ( === ...)
    public void eqLines(int lines) {
        System.out.println("=".repeat(lines));
    }

//    This is used for printing title with equals box
    public void titleMenu(String title) {
        String lenTitle = "= " + title + " =";
        this.lenTitleLine = lenTitle.length();
//      output
        System.out.println("=".repeat(lenTitleLine));
        System.out.println(lenTitle);
        System.out.println("=".repeat(lenTitleLine));
    }
}
