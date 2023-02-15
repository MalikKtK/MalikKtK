package Day1;

import java.util.Scanner;

public class MetodeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input er objekt
        MetodeDemo main = new MetodeDemo(); //demo er objekt
        //main.m1(); //objekt.metodenavn();
        //main.m2(); //objekt.metodenavn();
        //main.m3(); //objekt.metodenavn();

        main.m4();
    }

    public void m1() {
        System.out.print("hej ");

    }

    public void m2() {
        System.out.print("med ");

    }

    public void m3() {
        System.out.print("dig ");
    }
    public void m4() {
        m1();
        m2();
        m3();
    }
}