public class StabiloBossProgram {
    void go() {
        String[] color = { "Yellow" };
        int[] thickness = { 4 };
        int[] inkLeft = { 19 };

        /*
        String color2 = "Green";
        int thickness2 = 4;
        int inkLeft2 = 66;
         */


        System.out.println("\nMy marker #1: " +
                "\nColor: " + color[0] +
                "\nThickness: " + thickness[0] +
                "\ninkLeft: " + inkLeft[0]);

    }

    public static void main(String[] args) {
        new StabiloBossProgram().go();
    }
}
