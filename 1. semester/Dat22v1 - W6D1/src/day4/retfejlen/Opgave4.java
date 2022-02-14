package day4.retfejlen;

public class Opgave4 {
//    Programmet burde udskrive indhold af variablen resultat på skærmen, når værdien er større end 7. Men det sker ikke.
//
//    Ret fejlen.

    public static void main(String[] args) {
        int number1 = 50;
        int number2 = 7;
        double resultat = (double) number1/number2;

        if (resultat > 7) {
            System.out.println("Resultat større end 7");
        }
    }
}
