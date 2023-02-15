package demo;

import java.util.Scanner;

public class Main {
    /* Opgaven gik ud på at lave en Tomme-beregner.
       Vi skal kunne indtaste en længde i tommer, som derefter kunne beregne hvor mange centimeter svarede til. */
    public static void main(String[] args) {
        final double centimeter = 2.54; //Vores konstant ved at putte final foran. Centimeter der er på en tomme.
        double tommer;
        String jegVilUd = "Y";
        Scanner scanner = new Scanner(System.in); //Vores scanner


        System.out.println("Velkommen til programmet Tommeberegner til centimeter!");
        while (!jegVilUd.equals("E")) {
            System.out.println("Indtast en længde i tommer: ");
            tommer = scanner.nextDouble(); //Vi bruger scanner.nextDouble så det var muligt at skrive eksempelvis 2,4 tommer.
            System.out.println(tommer + " tommer svarer til " + tommer * centimeter + " centimeter");


            System.out.println("Hvis du vil forlade programmet tryk E ellers skriv nej!");
            jegVilUd = scanner.next();
            if (jegVilUd.equals("E")) {
                break;

            }


        }
    }
}
