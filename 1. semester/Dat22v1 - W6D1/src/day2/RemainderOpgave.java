package day2;

import java.util.Scanner;

public class RemainderOpgave {
    public static void main(String[] args) {
        int seconds;
        int sec;
        int hour;
        int minute;

        System.out.print("Enter total number of seconds: ");
        Scanner in = new Scanner(System.in);
        seconds = in.nextInt();
        if (seconds < 0) {
            seconds = seconds * -1;
        }
        sec = seconds % 60;
        hour = seconds / 60;
        minute = hour % 60;
        hour = hour / 60;

        System.out.printf("%d seconds = %d hours, %d, minutes and, %d seconds", seconds, hour, minute, sec);
        System.out.print("\n");
    }
}

