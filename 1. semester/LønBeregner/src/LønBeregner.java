import java.util.Scanner;

public class LønBeregner {
    Scanner in = new Scanner(System.in);

    int hoursWorked;          // Hvor mange timer man har arbejdet om ugen
    final double TIMELØN = 150;       // Timeløn
    final double SKATPROCENT = 0.0925; //skat procent om ugen. Beregnet udefra 37% om måneden.
    final double ARBEJDSMARKEDBIDRAGPROCENT = 0.08; //arbejdsmarkedbidrag procent
    double grundLøn;       // Grundløn om ugen
    double overTidBetaling = 0;      // Overtid for ugen
    double bruttoLøn;        // løn i alt om ugen
    double skat; //skat om ugen
    double nettoLøn; //Løn du får efter skat og arbejdsbidrag.
    double arbejdsMarkedBidragIAlt; //arbejdsmarkedbidrag
    String name;
    public static void main(String[] args) {
        LønBeregner main = new LønBeregner();
        main.sætninger();
        main.beregninger();
        main.display();
    }

    public void sætninger() {
        System.out.print("Hvad er dit navn?: ");
        name = in.nextLine();

        System.out.println("Hvor mange timer har du arbejdet?: ");
        hoursWorked = in.nextInt();
    }

    public void beregninger() {
        //Hvis der er overtid
        if (hoursWorked > 37) {
            int overtime = hoursWorked - 37;
            hoursWorked = 37;
            overTidBetaling = 1.5 * TIMELØN * overtime;
        }
        //Normal løn
        grundLøn = TIMELØN * hoursWorked;

        //løn i alt
        bruttoLøn = overTidBetaling + grundLøn;

        //Nettoløn
        skat = bruttoLøn * SKATPROCENT;
        arbejdsMarkedBidragIAlt = bruttoLøn * ARBEJDSMARKEDBIDRAGPROCENT;
        nettoLøn = bruttoLøn - skat - arbejdsMarkedBidragIAlt;

    }

    public void display() {
        //display
        System.out.printf(name + "s uge løn:%n");
        System.out.printf("Hours worked:        %d " + "hours.%n", hoursWorked);
        System.out.printf("Time løn:            %.2f " + "kr.%n", TIMELØN);
        System.out.printf("Grundløn:            %.2f " + "kr.%n", grundLøn);
        System.out.printf("Overtid:             %.2f " + "kr.%n", overTidBetaling);
        System.out.printf("Skat:                %.2f " + "kr.%n", skat);
        System.out.printf("Arb.bidrag:          %.2f " + "kr.%n", arbejdsMarkedBidragIAlt);
        System.out.printf("Bruttoløn:           %.2f " + "kr.%n", bruttoLøn);
        System.out.printf("Netto løn:           %.2f " + "kr.%n%n", nettoLøn);
    }
}
