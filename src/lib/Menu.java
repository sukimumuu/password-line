package lib;

import helpers.LinePrinter;
import java.util.Scanner;
import lib.Menus.MakeProfile;
public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public void menu(){
        LinePrinter lp = new LinePrinter();
        lp.titleMenu("PASSWORD LINE");
        lp.print("1. Make Profile");
        lp.print("2. Load Profile");
        lp.print("3. Show Profile");
        lp.print("4. Exit\n");
        lp.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                MakeProfile mp = new MakeProfile();
                mp.insertProfile();
                break;
            case 2:
                lp.print("Cooming Soon ! ");
                break;
            case 3:
                lp.print("Cooming Soon ! ");
                break;
            case 4:
                lp.print("Cooming Soon ! ");
                break;
            default:
                lp.print("Invalid choice, your choice is " + choice);
        }
    }


}
