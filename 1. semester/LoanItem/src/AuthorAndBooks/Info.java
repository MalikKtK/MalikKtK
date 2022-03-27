package AuthorAndBooks;

import java.util.ArrayList;

public class Info {
    private ArrayList<Author> authors = new ArrayList<>();


    public ArrayList<Author> createAuthorList() {
        Author andersen = new Author("H. C. Andersen", 'M', "hc@andersen");
        Author rowling = new Author("J. K. Rowling", 'F', "jk@rowling.co.uk");
        Author kirkegaard = new Author("Kirkegaard", 'M', "kirke@gaard.dk");

        authors.add(andersen);
        authors.add(rowling);
        authors.add(kirkegaard);
        Book book = new Book("Klods Hans", andersen, 48);
        Book book1 = new Book("Fyrtøjet", andersen, 37);
        Book book2 = new Book("Harry Potter - Part 1", rowling, 437);
        Book book3 = new Book("Harry Potter - Part 2", rowling, 652);
        Book book4 = new Book("Harry Potter - Part 3", rowling, 318);
        Book book5 = new Book("Harry Potter - Part 4", rowling, 445);
        Book book6 = new Book("Filosofiens grundviden", kirkegaard, 912);
        Book book7 = new Book("Filosofi for viderekomne", kirkegaard, 713);
        Book book8 = new Book("Avanceret akademisk filosofi", kirkegaard, 599);
        andersen.addBook(book);
        andersen.addBook(book1);
        kirkegaard.addBook(book6);
        kirkegaard.addBook(book7);
        kirkegaard.addBook(book8);
        rowling.addBook(book2);
        rowling.addBook(book3);
        rowling.addBook(book4);
        rowling.addBook(book5);
        return authors;
    }


    public void printStuff() {
        String printResult = "";
        for (Author author: authors) {
            printResult += "Name: " + author.getName();
            printResult += "\n";
            printResult += "Gender: " + author.getGender();
            printResult += "\n";
            printResult += "Mail: " + author.getEmail();
            printResult += "\nBooks: \n";
            printResult += author.printBooks();
            printResult += "\n";
        }
        System.out.println(printResult);
    }

}