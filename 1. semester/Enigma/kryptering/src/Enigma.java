import java.util.Scanner;

public class Enigma {
    boolean mainUIRunning;
    int userSelection;
    int shift;
    char[] shiftKey;
    char[] plaintextChars;
    char[] cypherChars;
    String cypher;
    String plaintext;
    String alphabetAndSpace = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
    Scanner in = new Scanner(System.in);

    public char intToChar(int idx) {
        // converts range [0-29] to range [' ', A-Å]
        return alphabetAndSpace.charAt(idx);
    }

    public int charToInt(char c) {
        // converts range [' ', A-Å] to range [0-29]
        return alphabetAndSpace.indexOf(c);
    }

    public String caesarEncryption(char[] plaintext, int shift) {
        StringBuilder cypher = new StringBuilder();
        char shiftedChar;
        int charIndex;
        int modulusNoSpace = 1;

        for (char c : plaintext) {
            // shift letters and preserve spaces
            if (c == ' ') {
                cypher.append(' ');

            } else {
                charIndex = (charToInt(c) + shift - modulusNoSpace) % (alphabetAndSpace.length() - modulusNoSpace);
                shiftedChar = intToChar(charIndex + modulusNoSpace);
                cypher.append(shiftedChar);
            }
        }
        return cypher.toString();
    }

    public String caesarDecryption(char[] cypher, int originalShift) {
        return caesarEncryption(cypher, (alphabetAndSpace.length() - 1 - originalShift));
    }


    public String vigenereEncryption(char[] plaintext, char[] shiftKey) {
        StringBuilder cypher = new StringBuilder();
        char shiftedChar;
        int charShiftIndex;
        int charIndex;
        int shift;
        int modulusNoSpace = 1;

        for (int i = 0; i < plaintext.length; i++) {
            // shift letters and preserve spaces
            if (plaintext[i] == ' ') {
                cypher.append(' ');

            } else {
                shift = charToInt(shiftKey[i % shiftKey.length]);
                charIndex = charToInt(plaintext[i]);

                charShiftIndex = (charIndex + shift - modulusNoSpace) % (alphabetAndSpace.length() - modulusNoSpace);
                shiftedChar = intToChar(charShiftIndex + modulusNoSpace);
                cypher.append(shiftedChar);
            }
        }

        return cypher.toString();
    }

    public String vigenereDecryption(char[] cypher, char[] originalShiftKey) {
        char[] inverseShiftKey = new char[originalShiftKey.length];
        int inverseCharIndex;
        int charIndex;
        int modulusNoSpace = 1;

        // create inverse of original shift key
        for (int i = 0; i < originalShiftKey.length; i++) {
            if (originalShiftKey[i] == ' ') {
                inverseShiftKey[i] = ' ';

            } else {
                charIndex = charToInt(originalShiftKey[i]);
                inverseCharIndex = (alphabetAndSpace.length() - charIndex - modulusNoSpace) % (alphabetAndSpace.length() - modulusNoSpace);
                inverseShiftKey[i] = intToChar(inverseCharIndex);
            }
        }

        return vigenereEncryption(cypher, inverseShiftKey);
    }


    public String numberEncoding(char[] plaintextChars) {
        StringBuilder numberEncoding = new StringBuilder();

        for (int i = 0; i < plaintextChars.length; i++)
            if (i == plaintextChars.length - 1) {
                numberEncoding.append(charToInt(plaintextChars[i]));
            } else {
                numberEncoding.append(charToInt(plaintextChars[i]));
                numberEncoding.append(" ");
            }

        return numberEncoding.toString();
    }

    public String numberDecoding(String numbersString) {
        String[] numbersArray = numbersString.trim().split(" ");
        StringBuilder numberDecoding = new StringBuilder();
        char c;

        for (String s : numbersArray) {
            c = intToChar(Integer.parseInt(s));

            numberDecoding.append(c);
        }

        return numberDecoding.toString();
    }

    public void caesarUI() {
        System.out.print("""
				\nCaesar
				1) Encrypt
				2) Decrypt
				SELECT:\040""");
        userSelection = Integer.parseInt(in.nextLine());

        // encrypt
        if (userSelection == 1) {
            System.out.println("\nCaesar encryption");
            System.out.print("input plaintext:");
            plaintextChars = in.nextLine().toUpperCase().toCharArray();

            System.out.print("input shift value[0-29]:");
            shift = Integer.parseInt(in.nextLine());

            cypher = caesarEncryption(plaintextChars, shift);
            System.out.printf("\ncypher: \"%s\"\n", cypher);
        }

        // decryption
        System.out.println("\nCaesar decryption");
        System.out.print("input cypher:");
        cypherChars = in.nextLine().toUpperCase().toCharArray();


        System.out.print("input original shift value[0-29]:");
        shift = Integer.parseInt(in.nextLine());

        plaintext = caesarDecryption(cypherChars, shift);
        System.out.printf("\nplaintext: \"%s\"\n", plaintext);
    }

    public void vigenereUI() {
        System.out.print("""
				\nVigenère
				1) Encrypt
				2) Decrypt
				SELECT:\040""");
        userSelection = Integer.parseInt(in.nextLine());

        // encrypt
        if (userSelection == 1) {
            System.out.println("\nVigenère encryption");
            System.out.print("input plaintext:");
            plaintextChars = in.nextLine().toUpperCase().toCharArray();

            System.out.print("input shift key:");
            shiftKey = in.nextLine().toUpperCase().toCharArray();

            cypher = vigenereEncryption(plaintextChars, shiftKey);
            System.out.printf("\ncypher: \"%s\"\n", cypher);
        }

        // decryption
        System.out.println("\nVigenère decryption");
        System.out.print("input cypher:");
        cypherChars = in.nextLine().toUpperCase().toCharArray();

        System.out.print("input original shift key:");
        shiftKey = in.nextLine().toUpperCase().toCharArray();

        plaintext = vigenereDecryption(cypherChars, shiftKey);
        System.out.printf("\nplaintext: \"%s\"\n", plaintext);
    }

    public void numberUI() {
        System.out.print("""
				\nNumber
				1) Number-encoding
				2) Number-decoding
				SELECT:\040""");
        userSelection = Integer.parseInt(in.nextLine());

        // encoding
        if (userSelection == 1) {
            System.out.print("""
					\nNumber-encoding
					input plaintext:""");
            plaintextChars = in.nextLine().toUpperCase().toCharArray();

            cypher = numberEncoding(plaintextChars);
            System.out.printf("\nNumber-encoding: \"%s\"\n", cypher);
        }

        // decoding
        System.out.print("""
				\nNumber decoding
				- A number-encoding is given by multiple numbers in range[0-29] each representing one char[' ', A-Å] seperated by a single space.
				input number-encoding:""");
        plaintext = numberDecoding(in.nextLine());

        System.out.printf("\nplaintext: \"%s\"\n", plaintext);
    }

    public void mainUI() {
        mainUIRunning = true;
        do {
            // select protocol
            System.out.print("""
					\n1) Caesar
					2) Vigenère
					3) Number
					0) Exit
					SELECT:\040""");
            userSelection = Integer.parseInt(in.nextLine());

            switch (userSelection) {
                default -> // Caesar - case 1
                        caesarUI();
                case 2 -> // Vigenère
                        vigenereUI();
                case 3 -> // Number
                        numberUI();
                case 0 -> mainUIRunning = false;
            }
        } while (mainUIRunning);

    }

    public void testing() {
        char[] word = {' ', 'A', 'B', 'C', 'Å', 'Å', 'Å', 'Å', ' '};
        char[] shift = {' ', 'A', 'B', 'C',};
        String out = numberEncoding(word);
        System.out.println(out);

        System.out.println(numberDecoding("1 2 2 2 2"));

    }

    public static void main(String[] args) {
        new Enigma().mainUI();
//		new Enigma().testing();
    }
}