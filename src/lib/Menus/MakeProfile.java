package lib.Menus;

import helpers.LinePrinter;
import java.util.*;

public class MakeProfile {
    private final String FILE_NAME = "profiles.txt";
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

        try {
            java.io.FileWriter writer = new java.io.FileWriter(FILE_NAME, true);
            writer.write("name["+name+"]" + '\n');
            writer.write("password["+password+"]" + '\n');
            writer.close();
            lp.print("Your profile has been successfully made.");
        } catch (Exception e) {
            lp.print("Error: " + e.getMessage());
        }

    }

    
}
