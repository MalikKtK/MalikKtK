import java.util.Scanner;

public class krytp {
    Scanner sc = new Scanner(System.in);
    int shift, i, n; //Vores shift
    String str; //Vores string for beskeden
    String str1 = ""; //vores udskrevet kryptering
    String str2 = ""; //vores udskrevet dekryptering
    char ch3, ch4; //til vores besked tager hvert bogstav og krypterer og dekrypterer
    int userInput;
    boolean isRunning;

    void loop() {
        isRunning = true;
        do {
            System.out.print("""
                    \nCaesar
                    1) Encrypt
                    2) Decrypt
                    3) Exit
                    SELECT:\040""");
            //En gui, hvor vi har 3 valgmuligheder. Encrypt, decrypt og exit. En fejl er, hvis man vælger at encrypt eller decrypt igen, kan vi ikke få den til at resette. Den kopirere den forrig besked først.
            userInput = Integer.parseInt(sc.nextLine());
            switch (userInput) {
                case 1 -> {
                    System.out.println("You choose Encrypt!");
                    System.out.println("Enter the message: ");
                    str = sc.nextLine(); //Vores input for beskeden
                    str = str.toLowerCase(); //Tvinger beskeden til at være lowercase. Kunne ikke få det til at fungerer med begge.
                    n = str.length(); //Finder længden af vores besked.
                    System.out.println("Enter the value by which each letter of the string is to be shifted");
                    shift = Integer.parseInt(sc.nextLine()); //Enter vi value for shift, hvor mange gange bogstaverne skal rykke
                    kryptering(); //kalder på vores kryptering metode
                }
                case 2 -> {
                    System.out.println("You chose Decrypt!");
                    System.out.println("Enter the message: ");
                    str = sc.nextLine();
                    str = str.toLowerCase();
                    n = str.length();
                    System.out.println("Enter the value by which each letter of the string is to be shifted");
                    shift = Integer.parseInt(sc.nextLine());
                    dekryptering();
                    // Samem gjort oven.
                }
                case 3 -> {
                    System.out.println("Bye!");
                    isRunning = false;
                }
            }
        } while (isRunning);
    }

    void kryptering() {
        System.out.println();
        System.out.println("Encrypted text is");
        char[] ch1 = str.toCharArray(); //Kopirer karakterne for vores string i en Unicode character array
        for (i = 0; i < n; i++) {
            if (Character.isLetter(ch1[i])) { //Finder ud af om en bestemt karakter er et karakter
                ch3 = (char) (((int) ch1[i] + shift - 97) % 26 + 97);  //Algoritmen for kryptring med caesar. 97 er fra lille a, vi % 26 for sørger for vores array af bogstaver går i en cirkel.
                str1 = str1 + ch3; //Denne sætter de bogstaver der skal erstattes med vores rigtige besked.
            } else if (ch1[i] == ' ') {
                str1 = str1 + ch1[i]; //Den registrerer, hvis der er mellemrum i sætningen. Da mellemrum ikke bliver talt med som en karakter i vores arraylist.
            }
        }
        System.out.println(str1); //Printer encryption.
    }

    void dekryptering() {
        System.out.println();
        System.out.println("Decrypted text is");

        char[] ch2 = str.toCharArray();
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(ch2[i])) {
                if (((int) ch2[i] - shift) < 97) {
                    ch4 = (char) (((int) ch2[i] - shift - 97 + 26) % 26 + 97);

                } else {
                    ch4 = (char) (((int) ch2[i] - shift - 97) % 26 + 97);
                }
                str2 = str2 + ch4;
            } else if (ch2[i] == ' ') {
                str2 = str2 + ch2[i];
            }
        }
        System.out.println(str2);
    }
//Samme gjort, bare omvendt for kryptering

    public static void main(String[] args) {
        new krytp().loop();
    }
}
//Vi kunne ikke implemeterer æ, ø, å med den måde vi havde løst opgaven. Her kunne man eksempelvis lavet en String med alle bogstaver.
//Vi kunne derudover ikek implementer at bruge store bogstaver og lille på en gang.
//Vores program køres i et loop, dog er der en fejl. Hvis du vælger at krypterer og dekrypterer efter du har gjort det først omgang, vælger den stadig at gemme forig besked.