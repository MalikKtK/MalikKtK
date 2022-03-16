public class StabiloBoss {
    String color;
    int thickness;
    int inkLeft;
    int age;
    int yearOfProduction;
    StabiloBoss() {
        System.out.println("CONSTRUCTIONG STABIOLO BOSS!!");
    }
    StabiloBoss(int y) {
        yearOfProduction = y;
        calcAge();
    }
    void calcAge() {
        age = 2022 - yearOfProduction;
    }

    void writeText(String text) {
        System.out.println(text);
    }
}
