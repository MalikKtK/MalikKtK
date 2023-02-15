package Day1;

import java.util.Scanner;

public class StørsteTal {
    int numberOne, numberTwo, largest;
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        StørsteTal main = new StørsteTal();
        main.getUserInput();
        main.findLargestNumber();
        main.displayLargestNumber();
    }

    public void getUserInput() {
        System.out.println("First number?: ");
        numberOne = in.nextInt();
        System.out.println("Second number?: ");
        numberTwo = in.nextInt();
    }

    public void findLargestNumber() {

        if (numberOne > numberTwo) {
            largest = numberOne;
        } else {
            largest = numberTwo;
        }
    }

    public void displayLargestNumber() {
        System.out.println("\nLargest = " + largest);
    }
}
