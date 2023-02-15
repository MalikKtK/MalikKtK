package opgaver;

import java.util.ArrayList;

public class Bibliotek {
  private ArrayList<Bog> books;
  
  Bibliotek() {
    this.books = new ArrayList<>();
  }
  
  public boolean contains(Bog bog) {
    for (Bog b : books) {
      if (b.getISBN() == bog.getISBN()) {
        return true;
      }
    }
    
    return false;
  }
  
  public void addBook(Bog bog) {
    this.books.add(bog);
  }
  
  public void setBooks(ArrayList<Bog> books) {
    this.books = books;
  }
  
  public static void main(String[] args) {
    Bibliotek bibliotek = new Bibliotek();
    // bibliotek books
    Bog bog1 = new Bog(1, "bog 1", 2020);
    Bog bog2 = new Bog(2, "bog 2", 2021);
    Bog bog3 = new Bog(3, "bog 3", 2022);
    
    // test books
    Bog bog1_copy = new Bog(1, "bog 1", 2020);
    Bog bog_other= new Bog(99, "bog 99", 1990);
    
    // populate
    bibliotek.addBook(bog1);
    bibliotek.addBook(bog2);
    bibliotek.addBook(bog3);
  
  
    System.out.println(bibliotek.contains(bog1_copy));
    System.out.println(bibliotek.contains(bog_other));
  }
}
