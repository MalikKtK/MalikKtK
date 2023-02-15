import java.util.Scanner;

public class LoopUntil99 {
    boolean isPlaying = true;
    int number;
    Scanner in = new Scanner(System.in);

    void go() {

        while (isPlaying) {
            System.out.println("\nEnter number (99 to quit)");
            number = in.nextInt();
            System.out.println("You entered " + number);
            if (number == 99) {
                isPlaying = false;
            }
        }
    }

    public static void main(String[] args) {
        new LoopUntil99().go();
    }
}

