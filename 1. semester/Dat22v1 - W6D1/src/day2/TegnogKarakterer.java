package day2;

import java.util.Scanner;

public class TegnogKarakterer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        //DET SKAL VÆRE "Britney Spears"
        //(anførselstegn er selvølgelig ikke nødvendigt)
        System.out.println("user-input (Indtast venligst: Britney Spears): ");
        str = sc.nextLine();

        //Enter hver gang for at se dem en ad gangen//


        System.out.println("Fulde Navn: " + str);
        sc.nextLine();

        System.out.println("Uden mellemrum: " + str.replaceAll(" "," "));
        sc.nextLine();

        System.out.println("Forbogstav og navn: " + str.charAt(0)+"."+ str.substring(7, str.length()));
        sc.nextLine();

        System.out.println("Initialer: " + str.charAt(0)+str.charAt(8));
        sc.nextLine();

        System.out.println("Fornavn og efternavn under hinanden: " + "\n" + str.substring(0,7) + "\n" + str.substring(7,14));
        sc.nextLine();

        System.out.println("Efternavn komma fornavn: " + str.substring(8,14) + ", " + str.substring(0,7));
        sc.nextLine();

        System.out.println("Fulde navn i anførselstegn Britney Spears: " + '"'+ str +'"');
        sc.nextLine();

        System.out.println("Fulde navn i apostroffer 'Britney Spears': " + "'"+ str +"'");
        sc.nextLine();

        System.out.println("Fornavn uden det første og sidste bogstav: " + str.substring(1,6));
        sc.nextLine();

        System.out.println("Første og sidste bogstav i efternavn: " + str.charAt(8) + str.charAt(13));
        sc.nextLine();
    }
}