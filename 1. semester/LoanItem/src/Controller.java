import java.util.ArrayList;
import java.util.List;

public class Controller {
    boolean isRunning = true;
    Interface userInterface = new Interface();
    private final ArrayList<LoanItem> items = new ArrayList<>();

    public void run() {
        while (isRunning) {
            userInterface.askForInput();
            userAction();
        }
        System.out.println(List.of(items));
        print();
    }


    public void print() {
        StringBuilder printResult = new StringBuilder();
        for (LoanItem item : items) {
            printResult.append(item);
        }
        System.out.println(printResult);
    }


    public void userAction() {
        switch (userInterface.getUserInput()) {
            case "books", "b" -> {
                System.out.println("What is the title?");
                items.add(new Book("Book", userInterface.getUserInput()));
            }

            case "videos", "v" -> {
                System.out.println("What is the title?");
                items.add(new Video("Video", userInterface.getUserInput()));
            }

            case "exit", "e" -> isRunning = false;
        }
    }


}