package Day5;

public class Run {
    void go() {
        Car c1 = new Car("ABC");
        Car c2 = c1;
//        System.out.println("C1: " + c1.getRegNo());
//        System.out.println("C2: " + c2.getRegNo());
//        c2.setRegNo("DEF");
//        System.out.println("C1: " + c1.getRegNo());
//        System.out.println("C2: " + c2.getRegNo());

    }

    public static void main(String[] args) {
        new Run().go();
    }
}
