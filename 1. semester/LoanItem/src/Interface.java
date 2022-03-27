import java.util.Locale;
import java.util.Scanner;

public class Interface {
    private Scanner input = new Scanner(System.in);
    private String in;

    public String getUserInput() {
        in = input.nextLine().toLowerCase(Locale.ROOT);
        return in;
    }

    public void askForAmount() {
        System.out.println("How many items do you wish to loan?");
    }

    public void askForInput() {
        System.out.println("""
        What would you like to loan?
        Books
        Videos
        Nothing
        """);
    }


}