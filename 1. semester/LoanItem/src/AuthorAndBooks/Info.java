package AuthorAndBooks;

import java.util.ArrayList;

public class Info {
    private final ArrayList<Author> authors = new ArrayList<>();


    public void createAuthorList() {
        Author andersen = new Author("H. C. Andersen", 'M', "hc@andersen");
        Author rowling = new Author("J. K. Rowling", 'F', "jk@rowling.co.uk");
        Author kirkegaard = new Author("Kirkegaard", 'M', "kirke@gaard.dk");

        authors.add(andersen);
        authors.add(rowling);
        authors.add(kirkegaard);
        Book book = new Book("Klods Hans", andersen, 48);
        andersen.addBook(book);
        Book book1 = new Book("Fyrtøjet", andersen, 37);
        andersen.addBook(book1);
        Book book2 = new Book("Harry Potter - Part 1", rowling, 437);
        rowling.addBook(book2);
        Book book3 = new Book("Harry Potter - Part 2", rowling, 652);
        rowling.addBook(book3);
        Book book4 = new Book("Harry Potter - Part 3", rowling, 318);
        rowling.addBook(book4);
        Book book5 = new Book("Harry Potter - Part 4", rowling, 445);
        rowling.addBook(book5);
        Book book6 = new Book("Filosofiens grundviden", kirkegaard, 912);
        kirkegaard.addBook(book6);
        Book book7 = new Book("Filosofi for viderekomne", kirkegaard, 713);
        kirkegaard.addBook(book7);
        Book book8 = new Book("Avanceret akademisk filosofi", kirkegaard, 599);
        kirkegaard.addBook(book8);
    }


    public void printStuff() {
        StringBuilder printResult = new StringBuilder();
        for (Author author : authors) {
            printResult.append("AUTHORS AND BOOKS:\n");
            printResult.append("Name: ").append(author.getName());
            printResult.append("\n");
            printResult.append("Gender: ").append(author.getGender());
            printResult.append("\n");
            printResult.append("Mail: ").append(author.getEmail());
            printResult.append("\nBooks: \n");
            printResult.append(author.printBooks());
            printResult.append("\n");
        }
        System.out.println(printResult);
    }

}