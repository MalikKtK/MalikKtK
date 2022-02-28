public class ForDemo {

    public void go() {
        for (int i = 0; // Initialisering
             i <= 5; // Betingelse
             i++) { // Inkrementering
            System.out.println(i);
        }

        System.out.println();
        for (int i = 0; i <= 5; i +=2)
            System.out.println(i);

        System.out.println();
        for(double num = 0.2; num < 10; num = num + 0.7)
            System.out.println(num);

        System.out.println();
        for (char c = '1'; c <= '9'; c++)
            System.out.println(c);

        System.out.println("BATTLE");
        for (int i = -10; i<=10; i++)
            System.out.print("[" + i + "]" + " ");
    }

    public static void main(String[] args) {
        new ForDemo().go();
    }
}
