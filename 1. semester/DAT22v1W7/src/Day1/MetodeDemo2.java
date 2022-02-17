package Day1;


import java.time.DayOfWeek;
import java.time.LocalDate;

public class MetodeDemo2 {

    int point = 100;
    public static void main(String[] args) {
        MetodeDemo2 demo2 = new MetodeDemo2();
        demo2.doubleUpIfMonday();
        demo2.displayPoint();

    }

    public void doubleUpIfMonday() {
        // test
        // System.out.println("MONDAY");
        LocalDate today = LocalDate.now();
        //hvis det er mandag, så double mine point
        if (today.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            point = point * 2;
        }
    }
    public void displayPoint(){
        System.out.println(point);
    }
}
