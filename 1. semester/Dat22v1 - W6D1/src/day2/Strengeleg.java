package day2;

import java.util.Scanner;

public class Strengeleg {
    public static void main(String[] args) {
        String str1;
        String str2;


        Scanner in = new Scanner(System.in);
        System.out.println("Type String 1: ");
        str1 = in.nextLine();
        System.out.println("Type String 2: ");
        str2 = in.nextLine();
        System.out.println("First char: " + "[" + str1.charAt(0) + "]");
        System.out.println("Length: " + "[" + str1.length() + "]");
        System.out.println("Last char: " + "[" + str1.charAt(str1.length() - 1) + "]");
        System.out.println("Equals(str2): " + "[" + str1.equals(str2) + "]");
        System.out.println("comparedTo(str2): " + "[" + str1.compareTo(str2) + "]");
        System.out.println("concat (str2): " + "[" + str1.concat(str2) + "]");
        System.out.println("Contains(Str) " + "[" + str1.contains(str2) + "]");
        System.out.println("toUpperCase: " + "[" + str1.toUpperCase() + "]");
        System.out.println("toLowerCase: " + "[" + str1.toLowerCase() + "]");
        System.out.println("trim(): " + "[" + str1.trim() + "]");
        System.out.println("substring(2): " + "[" + str1.substring(2) + "]");
        System.out.println("substring(2,3): " + "[" + str1.substring(2, 4) + "]");
        System.out.println("replace(str1#0, str2#0): " + "[" + str1.replace(str1.charAt(0), str2.charAt(0)) + "]");
    }
}
