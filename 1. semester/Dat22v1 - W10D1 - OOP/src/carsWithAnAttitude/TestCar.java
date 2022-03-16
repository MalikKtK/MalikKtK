package carsWithAnAttitude;

import java.util.Scanner;

public class TestCar {
    CarsWithAnAttitude c1 = new CarsWithAnAttitude("BMW", "2016", "Dyt");
    Scanner scan = new Scanner(System.in);
    void sound() {
        c1.setBrand("BMW");
        c1.setMake("2016");
        c1.setHonk("Dyt");
        System.out.println(c1.getBrand() + " " + c1.getMake() + " " + "makes the sound " + c1.getHonk());
    }

    void drive() {
        turnEngineOn();
        System.out.println(c1.getBrand() + " " + c1.getMake() + " " +  "drives");
        System.out.println(c1.getBrand() + " " + c1.getMake() + " " +  "stops");
        turnEngineOff();

    }
    void park(){
        System.out.println(c1.getBrand() + " " + c1.getMake() + " " +  "parks");
    }
    void turnEngineOn(){
            System.out.println("Do you wanna turn on your car?[Yes or No]: ");
            c1.userInput = scan.nextLine();
            if(c1.userInput.equalsIgnoreCase("Yes"))
            System.out.println("You are trying to turn on engine but its already on!");
    }
    void turnEngineOff() {
        if (c1.userInput.equalsIgnoreCase("No"))
            System.out.println("The Engine is turning off");
    }

    public static void main(String[] args) {
        TestCar go = new TestCar();
        go.sound();
        go.drive();
        go.park();
    }
}
