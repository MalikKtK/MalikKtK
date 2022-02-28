import java.util.Scanner;

public class LoopUntilQuit {
    String text;
    Scanner in = new Scanner(System.in);
    void go() {

        do {
            System.out.println("Enter text ('quit' to quit)");
            text = in.nextLine();
            System.out.println("You've entered: " + text);

        } while (!"QUIT".equals(text) && !"quit".equals(text) && !"Quit".equals(text)
                && !"quIT".equals(text) && !"QuIt".equals(text));
        }

    public static void main(String[] args) {
        new LoopUntilQuit().go();
    }
}

