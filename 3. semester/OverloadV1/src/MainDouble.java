public class MainDouble {

    private static void out(String s1) {
        System.out.println(s1);
    }

    private static void out(int i1) {
        System.out.println(i1);
    }

    private static void out(Integer i2) {
        System.out.println("Jeg er Integer: " + i2);
    }

    private static void out(boolean b1) {
        System.out.println("Jeg er boolean: " + b1);
    }

    private static void out(double v1) {
        System.out.println("Jeg er double: " + v1);
    }

    private static void out(Long l1) {
        System.out.println("Jeg er Long: " + l1);
    }

    private static void out(float f1) {
        System.out.println("Jeg er float: " + f1);
    }

    public static void main(String[] args) throws Exception {
        out(4 > 5);
        out(5.4);
        Long l1 = 456l;
        out(l1);
        float f1 = 12f;
        out(f1);
        Double d1 = 12.5;
        for (int i = 1; i < 10; i++) {
            d1 = d1 + 10000.1;
            out(d1);
        }
    }
}
