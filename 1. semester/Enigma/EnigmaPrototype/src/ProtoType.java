import java.util.Scanner;

public class ProtoType {
    Scanner in = new Scanner(System.in);
    char x;
    int numb;
        public int charToInt(char c) {
            if (c == ' ') {
                return 0;
            } else if (65 <= c && c <= 91) {
                return (int) c - 64;
            } else if (c == 'Æ') {
                return (int) c - 171;
            } else if (c == 'Ø') {
                return (int) c - 188;
            } else {
                return (int) c - 168;
            }
        }

        public char intToChar(int numbers) {
            if (numbers == 0) {
                return ' ';
            } else if (1 <= numbers && numbers <= 26) {
                return (char) (numbers + 64);
            } else if (numbers == 27) {
                return 'Æ';
            } else if (numbers == 28) {
                return 'Ø';
            } else {
                return 'Å';
            }
        }

         void displayTest() {
            System.out.println("Enter letter: ");
            x = in.next().charAt(0);
            System.out.println("The value of " + x + " is " + charToInt(x));
             System.out.println("Enter Number");
             numb = in.nextInt();
             System.out.println("The value of " + numb + " is " + intToChar(numb));
        }

        public static void main(String[] args) {
            new ProtoType().displayTest();

        }
    }

