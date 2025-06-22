package lib.Menus;

import helpers.LinePrinter;
import java.util.Scanner;
public class MakeProfile {
    private static Scanner scanner = new Scanner(System.in);
    private LinePrinter lp = new LinePrinter();
    private String name;
    private String password;


    public void insertProfile() {
        lp.titleMenu("Make Profile");
        lp.print("Enter your name: ");
        name = scanner.nextLine();
        lp.print("Enter your password: ");
        password = scanner.nextLine();

        lp.print(name + " " + password);
    }
}
