import java.util.Random;

public class RiskAnalysis {

    void go() {
        Risk[] risk = new Risk[25];
        Random rand = new Random();

        int i;
        System.out.println(ConsoleColors.BLACK_BOLD + "NO. Risk name" + "           Pro Con Sev level" +
                ConsoleColors.RESET);
        for (i = 0; i < 25; i++) {
            risk[i] = new Risk();
            System.out.println();
            risk[i].setPro(rand.nextInt(1+5) + 1);
            risk[i].setCon(rand.nextInt(1+5) + 1);
            risk[i].setSev(risk[i].getCon() * risk[i].getPro());
            if (risk[i].getSev() <= 5) {
                risk[i].setLevel(ConsoleColors.GREEN_BRIGHT + "VERY_LOW" + ConsoleColors.RESET);
            } else if (risk[i].getSev() <= 10) {
                risk[i].setLevel(ConsoleColors.GREEN + "LOW" + ConsoleColors.RESET);
            }else if (risk[i].getSev() <= 15) {
                risk[i].setLevel(ConsoleColors.YELLOW + "MEDIUM" + ConsoleColors.RESET);
            }else if (risk[i].getSev() <= 20) {
                risk[i].setLevel(ConsoleColors.RED + "HIGH" + ConsoleColors.RESET);
            }else {
                risk[i].setLevel(ConsoleColors.RED_BRIGHT + "VERY_HIGH" + ConsoleColors.RESET);
            }
            System.out.println("#" + (i + 1) + ": Risk number " + i + "       " +
                    risk[i].getPro() + "   " + risk[i].getCon() + "   " + risk[i].getSev() +
                    "   " + risk[i].getLevel());
        }

    }

    public static void main(String[] args) {
        new RiskAnalysis().go();

    }
}
