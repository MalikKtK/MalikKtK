package day2;

import java.util.Scanner;

public class TypeCaster {
    public static void main(String[] args) {
        double d = 17.34;
        int i = 52;

        Scanner scanner = new Scanner(System.in);
        d = scanner.nextDouble();
        i = (int) d;

        System.out.println(i);
    }
}
