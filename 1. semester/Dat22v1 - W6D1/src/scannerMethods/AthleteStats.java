package scannerMethods;

import java.util.Scanner;

public class AthleteStats {
    public static void main(String[] args) {
        String name;
        double time;
        final double ROUND = 0.5; //used for rounding nearest
        int seconds;
        int milliSeconds;
        double distance;
        int m;
        int cm;
        Scanner in = new Scanner(System.in);

        //User input
        System.out.print("Enter athlete's name: ");
        name = in.nextLine();

        System.out.print("Enter total number of seconds (as a double): ");
        time = in.nextDouble();
        in.nextLine();
        milliSeconds = (int) (time % 1.0 * 1000 + ROUND);
        seconds = (int) time;

        System.out.print("Enter total numbers of meters (as a double): ");
        distance = in.nextDouble();
        in.nextLine();
        cm = (int) (distance % 1.0 * 100 + ROUND);
        m = (int) distance;

        //Print user stats
        System.out.printf("\nStats of %s:\n", name);
        System.out.printf("Time: %s seconds and %d milliseconds\n", seconds, milliSeconds);
        System.out.printf("Distance: %d meters and %d cm\n", m, cm);
    }
}
