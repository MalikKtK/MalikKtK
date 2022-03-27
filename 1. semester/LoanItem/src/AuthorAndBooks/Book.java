package AuthorAndBooks;

public class Book {

    private String title;
    private int numPages;
    private Author author;

    public Book(String title, Author author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public Author getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return title + "     "
                + numPages;
    }
}