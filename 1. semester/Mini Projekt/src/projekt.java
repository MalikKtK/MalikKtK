import java.util.Random;
import java.util.Scanner;


public class miniprojekt {
    int distance = 21;
    int dice;
    int soldierAllyLocation;
    int soldierAlly = 25;
    int ammoAlly = 2500;
    int soldierEnemyLocation;
    int soldierEnemy = 25;
    int ammoEnemy = 2500;
    //String userInput;
    int playerMovement;
    int enemyMovement;
    String userInput;
    String movementChoice;
    int ps1 = 10;
    int ps2 = -10;

    Random rand = new Random();
    Scanner in = new Scanner(System.in);


    public void printWelcomeMessage() {

        System.out.println(ConsoleColors.YELLOW + "Welcome to Battle line!");
        System.out.println(ConsoleColors.YELLOW + "This game is about defeating the enemy! You can do that by either: ");
        System.out.print(ConsoleColors.RESET);
        System.out.print(ConsoleColors.GREEN + "1. Defeat all enemy!\n" + "2. Place and trigger a bomb in the enemy camp!\n" + "Every team starts with 25 solidors and firepower on 2.500!\n" + ConsoleColors.RESET);
    }

    public void setUpGame() {

        System.out.println("To start playing press [Enter] or end game press [Y]es: ");
        boolean isPlaying = true;

        while (isPlaying) {
            System.out.println("Do you want to move forward(F), move Backwards(B) or Attack(A)");
            userInput = in.nextLine();
            if (userInput.equals("F")) {
                dice = (rand.nextInt(6) + 1);
                if (dice == 1 || dice == 3 || dice == 5) {
                    playerMovement = 1;
                    System.out.println("Player moves " + playerMovement + " Forward");
                } else if (dice == 2 || dice == 4 || dice == 6) {
                    playerMovement = 2;
                    System.out.println("Player moves " + playerMovement + " Forward");
                }
            }
//        dice = (rand.nextInt(6) + 1);
//
//        if (dice == 1 || dice == 3 || dice == 5) {
//          enemyMovement = 1;
//          System.out.println("Enemy moves 1 tile: " + enemyMovement);
//        } else if (dice == 2 || dice == 4 || dice == 6) {
//          enemyMovement = 2;
//          System.out.println("Enemy moves 2 tiles: " + enemyMovement);
//        }
        }
    }

    public static void main (String[]args){
        //String userInput;
        miniprojekt mp = new miniprojekt();
        mp.printWelcomeMessage();
        mp.setUpGame();
    }


}
