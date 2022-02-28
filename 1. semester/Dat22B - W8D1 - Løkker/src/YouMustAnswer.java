import java.util.Scanner;

public class YouMustAnswer {
    String name;
    boolean isPlaying = true;
    Scanner in = new Scanner(System.in);

    void go() {
        do {
            System.out.println("Please enter your name: ");
            name = in.nextLine();
            if (name.length() == 0)
                System.out.println("You MUST enter your name.\n");
            else
                isPlaying = false;
        } while (isPlaying);
        System.out.println("Thank you " + name + ".");
    }

    public static void main(String[] args) {
        new LoopUntilQuit().go();
    }
}

