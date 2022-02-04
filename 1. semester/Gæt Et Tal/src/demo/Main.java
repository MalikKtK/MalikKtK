package demo;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//variabel for r, som er et tilfældigt nummer
        Random r = new Random();
        //sætter 1 som et laveste tal
        int Low = 1;
        //sætter 10 som det højeste tal
        int High = 10;
        //Genererer et tilfædigt tal mellem eller en af det højeste eller laveste tal
        int Result = r.nextInt(High - Low) + Low;

        //variabel for hvor mange forsøg man har tilbage
        int forsøg = 0;

        //printer introen til spillet og reglerne.
        System.out.println("Hej! Lad os spille et spil!");
        System.out.println("Gæt et nummer mellem 1 til 10!");
        System.out.println(" ");
        System.out.print("Hvad er dit gæt: ");
        System.out.println(" ");

        //variabel for Scanner
        Scanner scan = new Scanner(System.in);

        //et loop som vil fortsætte til den er tilfreds, altså hvis man gætter rigtigt
        for (forsøg = 1; forsøg < 4; forsøg++) {
            // giver bruger lov til at gætte
            int number = scan.nextInt();
            if (number == Result) { //Det her sker hvis en bruger gætter rigtigt under de fem forsøg.
                System.out.println("Korrekt! Det tog dig " + forsøg + " til at gætte det rigtige nummer!");
                System.out.println("Game over, YOU WON!");
                break;
            } else if (number < Low || number > High) { //påminder gætteområdet
                System.out.println("Husk at dit tal skal være mellem " + Low + " til " + High);
                System.out.println("Guess again...");
            } else if (number < Result && forsøg < 3) { //fortæller bruger om tallet er for lille
                System.out.println("Dit tal er for lavt. Gæt igen.");

            } else if (number > Result && forsøg < 3) { //fortæller bruger om tallet er for stort
                System.out.println("Dit gæt er for stort. Gæt igen.");

            } else if (number > Result && forsøg == 3) { //Fortæller brugeren du ikke gættede rigtigt indenfor 3 forsøg med for højt taæ
                System.out.println("Dit tal er for stor. GAME OVER, NOOB!");
                System.out.println("Du kunne ikke gætte det rigtige tal indenfor 3 forsøg");
                System.out.println("Det rigtige nummer er " + Result);
            } else if (number < Result && forsøg == 3) { //fortæller brugeren du ikke gættede rigtigt indenfor 3 forsøg med for lavt tal
                System.out.println("Dit tal er for lille. GAME OVER, NOOB!");
                System.out.println("Du kunne ikke gætte det rigtige tal indenfor 3 forsøg.");
                System.out.println("Det rigtige nummer er " + Result);
            }


        }

    }
}
