package demo;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String text = "dette er en tekst";
        boolean go0n= true;
        final int number = 60; //konstant som ikke kan ændres efter tildeling af værdi
        char A;


        while (go0n) {
            System.out.println(text);

        }

        // int randomNumber;
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        randomNumber = random.nextInt(10) + 1;
        randomNumber = random.nextInt(10) + 1;
        randomNumber = random.nextInt(10) + 1;
        randomNumber = random.nextInt(10) + 1;
        randomNumber = random.nextInt(10) + 1;
        randomNumber = random.nextInt(10) + 1;
    }
}
