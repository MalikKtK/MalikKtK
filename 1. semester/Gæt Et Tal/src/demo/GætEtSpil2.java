package demo;

import java.util.Random;
import java.util.Scanner;

public class GætEtSpil2 {
    public static void main(String[] args) {
        Random r = new Random (); //Tilfældig nummer
        int Lav = 1;
        int Høj = 10;
        int Svar = r.nextInt(Høj-Lav);
        int forsøg = 0;

        System.out.println("Hej! Er du klar til et spil!");
        System.out.println("Simpel regler. Du har 3 forsøg til at gætte et tal fra 1 til 10");
        System.out.println(" ");
        System.out.println("Gæt: ");
        System.out.println(" ");

        Scanner scan = new Scanner(System.in);

        for (forsøg = 1; forsøg<4;forsøg++) {
            int number = scan.nextInt();
            System.out.println();
        }
    }
}
