package scannerMethods;

import java.util.Scanner;

class ScannerMethodsmedprintf {
    public static void main(String[] args) {
        String name;
        int yearOfBirth;
        double bmi;
        boolean hasDriversLicense;
        char gender;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter year of birth: ");
        yearOfBirth = in.nextInt();
        System.out.print("Enter BMI: ");
        bmi = in.nextDouble();
        System.out.print("Enter driver's license (true/false): ");
        hasDriversLicense = in.nextBoolean();
        System.out.print("Enter gender: ");
        in.nextLine();
        gender = in.nextLine().charAt(0);

       /* System.out.println();
        System.out.printf("%Name: %s\n Year of birth: %d\n BMI: %.2f\n Has driver's license: %b\n Gender: %c", name, yearOfBirth, bmi, hasDriversLicense, gender);
        System.out.println(); */

        System.out.println();
        System.out.printf("Name: %s%n", name);
        System.out.printf("Year of birth: %d%n", yearOfBirth);
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.printf("Has driver's license: %b%n", hasDriversLicense);
        System.out.printf("Gender: %c%n", gender);
        System.out.println();

    }
}

