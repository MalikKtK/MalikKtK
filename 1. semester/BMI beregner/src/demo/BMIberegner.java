package demo;

import java.util.Scanner;

public class BMIberegner {
    public static void main(String[] args) {

        double weight;
        double height;
        double BMI;
        String ud = "Y";
        Scanner scanner = new Scanner(System.in);


        System.out.println("Velkommen til programmet Beregn dit BMI!");


        while (!ud.equals("E")) {
            System.out.println("Indtast din vægt i kg: ");
            weight = scanner.nextDouble();
            System.out.println("Indtast din højde i meter: ");
            height = scanner.nextDouble();
            BMI = weight / (height * height);
            System.out.printf("\nDu har en BMI på " + "%.2f" + "\n", BMI);

            // BMI kategori
            if (BMI < 18.5) {
                System.out.println("Du er undervægtig");
            } else if (BMI < 25) {
                System.out.println("Du er normalvægtig");
            } else if (BMI < 30) {
                System.out.println("Du er overvægtig");
            } else if (BMI < 40) {
                System.out.println("Du er svært overvægtig");
            }
            System.out.println("Hvis du vil forlade programmet tryk E ellers skriv nej!");
            ud = scanner.next();
            if (ud.equals("E")) {
            }
        }
    }
}
