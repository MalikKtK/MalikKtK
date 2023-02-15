package day3;

import java.util.Random;
import java.util.Scanner;

public class SimpleBlackJack {
    public static void main(String[] args) {
        int playerSum = 0;
        int dealerSum = 0;
        int newCard;
        String userInput;
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);


        boolean isPlaying = true;
        while (isPlaying) {

            System.out.print("Stop drawing card [y]es or [Enter] to continue: ");
            userInput = in.nextLine();
            // User stops game
            if (userInput.equals("y")) {
                isPlaying = false;

                // user draws card
            } else {

                // Player draws card
                newCard = (rnd.nextInt(13) + 1);
                if (newCard <= 10) {
                    playerSum += newCard;
                } else {
                    playerSum += 10;
                }
                System.out.printf("   You drew: %d -  your total is now: %d\n", newCard, playerSum);

                // Dealer draws card
                if (playerSum < 21 && dealerSum < 21) {
                    newCard = (rnd.nextInt(13) + 1);
                    if (newCard <= 10) {
                        dealerSum += newCard;
                    } else {
                        dealerSum += 10;
                    }
                    System.out.printf("dealer drew: %d -   his total is now: %d\n\n", newCard, dealerSum);
                }

            }
            // ending game by wins or loss
            if (playerSum >= 21 || dealerSum >= 21) {
                isPlaying = false;
            }

        }

        // if dealer is loosing
        while (playerSum >= dealerSum && dealerSum < 21 && playerSum <21) {
            // Dealer draws card
            newCard = (rnd.nextInt(13) + 1);
            if (newCard <= 10) {
                dealerSum += newCard;
            } else {
                dealerSum += 10;
            }
            System.out.printf("dealer drew: %d -   his total is now: %d\n\n", newCard, dealerSum);
        }

        // --- Assign wins and loss ---
        // Even
        if (playerSum == dealerSum) {
            System.out.println("Even");

            // Under 21 points
            // Player wins
        } else if (playerSum == 21) {
            System.out.println("Player blackjack");
        } else if (playerSum > dealerSum && playerSum < 21) {
            System.out.println("Player win");
            // Dealer wins
        } else if (dealerSum == 21) {
            System.out.println("Dealer blackjack");
        } else if (dealerSum > playerSum && dealerSum < 21) {
            System.out.println("Dealer wins");
        }
        // over 21 points
        else if (playerSum > 21 && dealerSum > 21) {
            System.out.println("Dealer wins");
        } else if (playerSum > 21) {
            System.out.println("Dealer wins");
        } else if (dealerSum > 21) {
            System.out.println("Player wins");
        }


    }


}


