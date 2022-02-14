package day4.retfejlen;

import java.util.Random;

public class Opgave1 {
    public static void main(String[] args) {

//        Det er meningen at programmet skal generere et tilfældigt tal mellem 1-6 til simulering af terningkast.
//
//        Når programmet kører, fås dog nogle gange tallet ’0’, hvilket ses af udskriften på skærmen (eller ved at bruge debuggeren).
//
//        Ret fejlen.
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        System.out.println(randomNumber);
    }
}
