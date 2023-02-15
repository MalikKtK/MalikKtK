package AuthorAndBooks;

public class Controller {
    Info info = new Info();

    public void run() {
        info.createAuthorList();
        info.printStuff();
    }

}