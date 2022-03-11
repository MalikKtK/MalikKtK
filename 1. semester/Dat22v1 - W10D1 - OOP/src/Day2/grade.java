package Day2;
import java.util.Scanner;

public class grade<anArray> {

    Scanner in = new Scanner(System.in);

    public void student(){
        skole name1 = new skole();
        skole name2 = new skole();
        skole name3 = new skole();

        name1.name = "Mark";
        name2.name = "Ebus";
        name3.name = "Malik";

        int karakter = name1.karakter;

        System.out.println("Giv studerende en karakter, vælg mellem Mark, Ebus og Malik ");
        in.nextLine();

    }


    public static void main(String[] args) {
        grade student = new grade();
        student.student();
        grade karakter1 = new grade();
        student.karakter1();
        grade addkarakter = new grade();
        student.addkarakter();

    }

    private void karakter1() {
        int [] anArray;
        anArray = new int[8];
        anArray[1] = -3;
        // initialize second element
        anArray[2] = 0;
        // and so forth
        anArray[3] = 2;
        anArray[4] = 4;
        anArray[5] = 7;
        anArray[6] = 10;
        anArray[7] = 12;
        System.out.println("Angiv en af følgende karakterer: "
                + anArray[1]);
        System.out.println("Angiv en af følgende karakterer: "
                + anArray[2]);
        System.out.println("Angiv en af følgende karakterer: "
                + anArray[3]);
        System.out.println("Angiv en af følgende karakterer: "
                + anArray[4]);
        System.out.println("Angiv en af følgende karakterer: "
                + anArray[5]);
        System.out.println("Angiv en af følgende karakterer: "
                + anArray[6]);
    }
    private void addkarakter(){
        in.nextInt();
        System.out.println("Din karakter er hermed tilføjet");

    }

}
