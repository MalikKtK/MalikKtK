import java.util.ArrayList;
import java.util.List;

public class Controller {
    boolean isRunning = true;
    Interface userInterface = new Interface();
    private ArrayList<LoanItem> items = new ArrayList<>();

    public void run() {
        while (isRunning) {
            userInterface.askForInput();
            pickYourAction();
        }
        System.out.println(List.of(items));
        print();
    }


    public void print() {
        String printResult = "";
        for (int i = 0; i < items.size(); i++) {
            printResult += items.get(i);
        }
        System.out.println(printResult);
    }


    public void pickYourAction() {
        switch (userInterface.getUserInput()) {
            case "books", "b" -> {
                System.out.println("What is the title?");
                items.add(new Book("Book", userInterface.getUserInput()));
            }

            case "videos", "v" -> {
                System.out.println("What is the title?");
                items.add(new Video("Video", userInterface.getUserInput()));
            }

            case "nothing", "n", "exit", "e" -> isRunning = false;
        }
    }


}