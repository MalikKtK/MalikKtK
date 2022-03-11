package Opgave;

public class Test {

    void go() {
        Kid name = new Kid();
        name.name = "Malik";
        name.yearOfBirth = 1999;
        System.out.println(name);

        Kid name2 = new Kid();
        name2.name = "Selena";
        name2.yearOfBirth = 1992;
        System.out.println(name2);

        Kid name3 = new Kid();
        name3.name = "Madison";
        name3.yearOfBirth = 1999;
        System.out.println(name3);

        Kid name4 = new Kid();
        name4.name = "Cristina";
        name4.yearOfBirth = 1998;
        System.out.println(name4);

        Kid name5 = new Kid();
        name5.name = "Manja";
        name5.yearOfBirth = 2001;
        System.out.println(name5);
    }


    public static void main(String[] args) {
new Test().go();
    }
}
