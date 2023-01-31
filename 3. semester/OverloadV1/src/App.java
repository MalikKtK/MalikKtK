public class App {

    private static void out(String s1) {
        System.out.println(s1);
    }

    private static void out(int i1) {
        System.out.println(i1);
    }

    private static void out(Integer i2) {
        System.out.println("Jeg er Integer: " + i2);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        out("hej");
        out(5);
        var obj = Integer.valueOf(5);
        out(Integer.valueOf("5"));
        Integer i1 = 50;
        out(i1);
        var obj1 = Integer.parseInt("ff", 16);
        out(obj1);
    }
}
