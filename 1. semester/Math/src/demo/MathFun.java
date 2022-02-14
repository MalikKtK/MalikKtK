package demo;

import java.util.Random;

public class MathFun {
    public static void main(String[] args) {
        int negNumber = -17;
        int posnumber = 14;

        System.out.println("Abs neg: " + Math.abs(negNumber));
        System.out.println("Abs pos: " + Math.abs(posnumber));

        System.out.println("Max: " + Math.max(negNumber, posnumber));

        System.out.println("Pow: " + Math.pow(14, 2));

        System.out.println("Sqrt: " + Math.sqrt(14));

        System.out.println("Random: " + Math.random());

        Random ran = new Random();
        // System.out.println(ran.nextInt(10) + 1);

        System.out.println(Math.round(14.2));
        System.out.println(Math.round(14.7));
    }
}
