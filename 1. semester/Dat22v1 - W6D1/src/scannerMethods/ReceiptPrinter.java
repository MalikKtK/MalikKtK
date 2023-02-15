package scannerMethods;

import java.util.Random;
import java.util.Scanner;

class ReceiptPrinter {
    public static void main(String[] args) {

        //Random generator for unique number
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int uniqueNumber = rand.nextInt(max - min + min);
        //Random generator for amount
        int minAmount = 1;
        int maxAmount = 5000;
        double amount = rand.nextInt(maxAmount - minAmount + minAmount);


        String date = "February 7, 2022";
        String name = "Cash Ripper";
        String methodOfPayment = "Credit card";
        String signature = "M. Anger";


        System.out.printf("%n%26s", "CASH RECEIPT");
        System.out.printf("%n%40s %n", "Unique number: " + uniqueNumber);
        System.out.printf("%40s %n", "Date: " + date);
        System.out.printf("%nName:%35s %n", name);
        System.out.printf("Amount:%29.2f kr. %n", amount);
        System.out.printf("Method of payment:%22s%n", methodOfPayment);
        System.out.printf("Signature:%30s %n", signature);
    }
}
