package Room;

public class Test {
    void go() {
        classRoom c1 = new classRoom(1.24, 25, 45, "Grey");
        System.out.println(c1);

        teachersResort t1 = new teachersResort(2.5, 25, "PS5", "Maximum");
        System.out.println(t1);
    }

    public static void main(String[] args) {
        new Test().go();
    }
}
