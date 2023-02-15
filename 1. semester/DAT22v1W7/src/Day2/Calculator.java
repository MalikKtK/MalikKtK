package Day2;

import java.util.Scanner;

public class Calculator {
    double num1;
    double num2;
    char o;
    Scanner sc = new Scanner(System.in);

    public void lommeRegner() {
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        System.out.println("Enter the operator (+,-,*,/)");
        o = sc.next().charAt(0);
        sc.nextLine();
        if (o == '+') {
            System.out.println("Dit svar er " + (num1 + num2));
        }
        if (o == '-') {
            System.out.println("Dit svar er " + (num1 - num2));
        }
        if (o == '*') {
            System.out.println("Dit svar er " + (num1 * num2));
        }
        if (o == '/') {
            System.out.println("Dit svar er " + (num1 / num2));
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.lommeRegner();
    }
}