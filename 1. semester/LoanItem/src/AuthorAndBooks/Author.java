package AuthorAndBooks;

import java.util.ArrayList;

public class Author {
    private String name;
    private char gender;
    private String email;
    private ArrayList<Book> books = new ArrayList<>();

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

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String printBooks() {
        String printResult = "";
        for (Book book : books) {
            printResult += book.getTitle();
            printResult += "              ";
            printResult += book.getNumPages();
            printResult += "\n";
        }
        return printResult;
    }

}