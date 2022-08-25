package opgaver;

import java.util.ArrayList;

public class Biblotek {
  private ArrayList<Bog> books;
  
  public Biblotek(ArrayList<Bog> books) {
    this.books = books;
  }
  
  public boolean contains(Bog bog) {
    for (Bog b : books) {
      if (b.getISBN() == bog.getISBN()) {
        return true;
      }
    }
    
    return false;
  }
  
  
  public ArrayList<Bog> getBooks() {
    return books;
  }
  
  public void setBooks(ArrayList<Bog> books) {
    this.books = books;
  }
}
