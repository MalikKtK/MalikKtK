package ex3;

import java.util.Scanner;

public class Grass {
    public int daysToCutGrass(double length, double max){
        var days = max - length / 0.8;
        return (int)days;
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("How long is the grass today? ");
        var length = input.nextDouble();
        System.out.print("How long is the max length of the grass? ");
        var max = input.nextDouble();
        
        var days = daysToCutGrass(length, max);
        System.out.println(days + " days until grass has to be cut!");
    }
}
