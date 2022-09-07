package ex1;
// Skriv en metode med navnet doesArraylistContainString, der modtager 2 parametrer: en arrayliste og en streng.
// Metoden returnerer en boolean:
// * Hvis strengen ikke findes i arraylisten indsættes strengen i listen og metoden returnerer false
// * Hvis strengen findes i arraylisten returnerer metoden true og printer ”The String has been found”

import java.util.ArrayList;

public class Ex1_ArrayList {

    public boolean doesArraylistContainString(ArrayList<String> list, String tekst){
        // løsning 1
        for (String st: list) {
            if(st.equals(tekst)){
                System.out.println("The String has been found");
                return true;
            }
            else {
                list.add(tekst);
                return false;
            }
        }

        // løsning 2
        if(list.contains(tekst)){
            System.out.println("The String has been found");
            return true;
        } else {
            list.add(tekst);
            return false;
        }



    }

}
