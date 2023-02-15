package AuthorAndBooks;

import java.util.ArrayList;

public class Author {
    private final String name;
    private final char gender;
    private final String email;
    private final ArrayList<Book> books = new ArrayList<>();

    public Author(String name, char gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void addBook(Book book) {
        books.add(book);
    }


    public String printBooks() {
        StringBuilder printResult = new StringBuilder();
        for (Book book : books) {
            printResult.append(book.getTitle());
            printResult.append("              ");
            printResult.append(book.getNumPages());
            printResult.append("\n");
        }
        return printResult.toString();
    }

}