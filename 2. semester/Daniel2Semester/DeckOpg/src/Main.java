import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck<>();

        deck.add("A");
        deck.add("B");
        deck.add("C");


        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i));
        }

        System.out.println(deck.get(2));

    }
}
