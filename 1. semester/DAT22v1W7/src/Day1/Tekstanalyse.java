package Day1;

import java.util.Scanner;

public class Tekstanalyse {
    Scanner scan = new Scanner(System.in);
    String str;
    String happy = "Humøret er vist godt i dag";
    String sad = "Humøret er vist ikke godt i dag";
    boolean humør;
    public static void main(String[] args) {
        Tekstanalyse demo = new Tekstanalyse();
        demo.sætning();
        demo.undersøge();
        demo.display();
    }
    public void sætning(){
       System.out.print("Indtast lige hvad der falder dig ind: ");
       str = scan.nextLine();

    }
    public void undersøge(){
        if (str.contains("trist") || str.contains("regn") || str.contains("sur")){
            humør = false;
        }else {
            str.contains("latter");
        str.contains("solskin");
        str.contains("dejlig");
        humør = true;
        }
    }
    public void display (){
        if (!humør){
            System.out.println(sad);
        }else {
            System.out.println(happy);
        }
    }
}
