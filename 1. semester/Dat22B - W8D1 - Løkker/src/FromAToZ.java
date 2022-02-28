public class FromAToZ {
    void go() {
        for (char c = 'A'; c <= 'Z'; ++c)
            System.out.print(c);

        System.out.println();
        for (char c = 'Z'; c >= 'A'; c--)
            System.out.print(c);
        System.out.println();
    }

    public static void main(String[] args) {
        new FromAToZ().go();
    }
}
