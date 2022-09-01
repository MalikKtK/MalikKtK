import java.util.Locale;
import java.util.Scanner;

public class Interface {
    private final Scanner input = new Scanner(System.in);

    public String getUserInput() {
        return input.nextLine().toLowerCase(Locale.ROOT);
    }

    public void askForInput() {
        System.out.println("""
        What would you like to loan?
        Books
        Videos
        Exit
        """);
    }


}