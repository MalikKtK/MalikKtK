package scannerMethods;

import java.util.Scanner;

class ScannerMethods {
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

        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println("BMI: " + bmi);
        System.out.println("Has driver's license: " + hasDriversLicense);
        System.out.println("Gender: " + gender);
    }
}
