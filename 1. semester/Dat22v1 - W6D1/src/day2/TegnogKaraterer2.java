package day2;

import java.util.Scanner;

public class TegnogKaraterer2 {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter full name (first name + last name): ");
        // name = "Britney Spears"; System.out.println("\n");
        name = in.nextLine();

        System.out.println("1. Full name: " + name);
        System.out.println("2. Name without space: " + name.substring(0, name.indexOf(' ')) +
                name.substring(name.indexOf(' ')+ 1));
        System.out.println("3. First name initial + last name: " + name.charAt(0) + ". " +
                name.substring(name.indexOf(' ') + 1));
        System.out.println("4. " + name.charAt(0) + name.charAt(name.indexOf(' ') + 1));
        System.out.println("5. Name without space:\n   First name:\t" + name.substring(0, name.indexOf(' ')) +
                "\n   Last name:\t" + name.substring(name.indexOf(' ')+ 1));
        System.out.println("6. Last name, first name: " + name.substring(name.indexOf(' ')+ 1) +
                ", " + name.substring(0, name.indexOf(' ')));
        System.out.println("7. Full name: \"" + name + "\"");
        System.out.println("8. Full name: '" + name + '\'');
        System.out.println("9. First name expect first and last letter: " +
                name.substring(1, name.indexOf(' ') - 1));
        System.out.println("10. First and last letter of last name: " + name.charAt(name.indexOf(' ') + 1) +
                name.charAt(name.length() - 1));
    }
}

