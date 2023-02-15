import java.util.ArrayList;

public class Library {
  
  ArrayList<Book> books = new ArrayList<>();
  
  public Library() {
    books.add(new Book("War Thunder", "John Doe", "123456789", 2019));
    books.add(new Book("Hacknet", "John Doe", "234567891", 2013));
    books.add(new Book("Hacknet", "John Doe", "345678912", 2022));
    books.add(new Book("Hacknet", "John Doe", "456789123", 2021));
  }
  
  public boolean doesBookExist(Book book){
    for (Book b : books) {
      if (b.getIsbn().equals(book.getIsbn())){
        return true;
      }
    }
    return false;
  }
}