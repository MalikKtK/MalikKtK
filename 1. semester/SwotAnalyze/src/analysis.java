import java.util.ArrayList;

public class analysis {

    void STRENGTHS(){
        ArrayList<String> STRENGTH=new ArrayList<String>();//Creating arraylist
        System.out.println("STRENGTHS");
        STRENGTH.add(ConsoleColors.BLUE + "1: Kræver ikke vedligeholdelse");//Adding object in arraylist
        STRENGTH.add("2: Kræver mindre end computerspil" + ConsoleColors.RESET);
        //Printing the arraylist object
        STRENGTH.forEach(System.out::println);
    }

    void WEAKNESS() {
        ArrayList<String> WEAKNESS=new ArrayList<String>();
        System.out.println("WEAKNESS");
        WEAKNESS.add(ConsoleColors.RED + "1: Lille budget" + ConsoleColors.RESET);
        WEAKNESS.forEach(System.out::println);
    }
    void OPPORTUNITIES() {
        ArrayList<String> OPPORTUNITIES=new ArrayList<String>();
        System.out.println("OPPORTUNITIES");
        OPPORTUNITIES.add(ConsoleColors.GREEN + "1: Pris pr arbejdstime");
        OPPORTUNITIES.add("2: Brætspil bliver moderne igen" + ConsoleColors.RESET);
        OPPORTUNITIES.forEach(System.out::println);
    }

    void THREATS() {
        ArrayList<String> THREATS=new ArrayList<String>();
        System.out.println("THREATS");
        THREATS.add(ConsoleColors.PURPLE + "1: Andre brætspil" + ConsoleColors.RESET);
        THREATS.forEach(System.out::println);

    }

}
