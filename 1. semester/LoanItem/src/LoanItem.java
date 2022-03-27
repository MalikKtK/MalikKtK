import java.util.ArrayList;

public abstract class LoanItem {
    private String title;
    private String type;


    public LoanItem(String type, String title) {
        this.type = type;
        this.title = title;
    }

}