import java.util.Scanner;

public class Hello5 {
    public static void main(String[] args) {
// generate some simple output
        System.out.println("Hello, World! \\\\");
        System.out.print("Hello Dat22v1");
        System.out.println();

        if (1 == 1) {
            System.out.println("One is equal to one");
        }

        //Erklæret en scanner (aka tastaturet)
        Scanner scanner = new Scanner(System.in);

        //erklære variabel med datatype og variabelnavn
        int number = 0; //initialiseret med værdien 0

        //loop
        //!= betyder "forskellig fra"
        while (number != -1){

            //Beder bruger indtaste et tal
            System.out.println("Enter a number: ");

            //Indlæs tal fra tastaturet
            number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Number is greater than zero");
            } else {
                System.out.println("Number is less that zero");
            }
        }
    }
}
