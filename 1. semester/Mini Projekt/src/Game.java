import java.util.Random;
import java.util.Scanner;

public class Game {
    //Scanner Objects
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int dice;
    public void printWelcomeMessage() {

        System.out.println(ConsoleColors.YELLOW + "Welcome to Battle line!");
        System.out.println(ConsoleColors.YELLOW + "This game is about defeating the enemy! You can do that by either: ");
        System.out.print(ConsoleColors.RESET);
        System.out.print(ConsoleColors.GREEN + "1. Defeat all enemy!\n" + "2. Place and trigger a bomb in the enemy camp!");
        System.out.print(ConsoleColors.RESET);
    }

    public void printStatusMessage() {

        //code
    }



    public void setUpGame() {

        dice = (random.nextInt(1+6) + 1);
        //Spillet foregår på en endimensional spilleplade (felten) med 21 felter. Det er reelt bare en række med 21 felternummereret fra -10 til 10.Feltet i den venstre ende er felt nr. -10 (spillerens lejr). Feltet i den højre ende er +10, som er fjendens lejr.I midten er felt nr. 0.
        //Ved spillets start slår spilleren og fjenden med en terning én gang hver og rykker antallet af øjne ind i felten, altså 1-6 felter ind mod felt nr. 0.Ved 1 placeres han på første felt (egen lejr), ved 2 på det næste felt i retning af felt nr. 0 osv.
        //Hver trop starter 25 soldater og en ildkraft på 2.500.
        //Dernæst skiftes parterne til at trække.
        //Når modstanderen er 1 eller 2 felter FORAN den som trækker, giver en spejder besked om at fjenden er tæt på samt hvor mange felter foran han er. Hvis fjenden er BAG den som trækker, giver en spejder en tilsvarende besked men op til 3 felter, da dette terræn er mere velkendt.
    }

    public void askPlayerChoice() {
        //Et træk består af et valg mellem at:
        //Rykke frem mod fjendens lejr. I dette tilfælde slår man med terningen og rykker 1 eller 2 felter frem -1 felt ved et ulige antal øjne, 2 felter ved et lige antal øjne
        //Trække sig tilbage mod egen lejr. Et terningkast afgør hvor mange felter: 1-2 = 1 felt, 3-4 = 2 felter, 5-6 = 3 felter. Under tilbagetrækning modtager man ny ildkraft (250point pr. træk).
        //Angribe modstanderen.Man slår med terningen igen, og der trækkes ildkraft svarende til 100 gange terningens øjne. Man kan ikke bruge mere ildkraft end manhar. Hvis modstanderen er 0 felter væk (står på samme felt), dør 6 af hans soldater. Er han 1 felt væk, dør 5 af hans soldater osv.
    }

    public void endGame() {

    }

    public static void main(String[] args) {
        Game execute = new Game();
        execute.printWelcomeMessage();
        execute.setUpGame();

    }
}
