package AuthorAndBooks;

public record Book(String title, Author author, int numPages) {

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }


    @Override
    public String toString() {
        return title + "     "
                + numPages;
    }
}