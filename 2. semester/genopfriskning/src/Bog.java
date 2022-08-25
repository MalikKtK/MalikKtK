package opgaver;

public class Bog {
  private int ISBN;
  private String title;
  private int releaseYear;
  
  public Bog(int ISBN, String title, int releaseYear) {
    this.ISBN = ISBN;
    this.title = title;
    this.releaseYear = releaseYear;
  }
  
  public int getISBN() {
    return ISBN;
  }
  
  public void setISBN(int ISBN) {
    this.ISBN = ISBN;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public int getReleaseYear() {
    return releaseYear;
  }
  
  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }
  
  @Override
  public String toString() {
    return String.format("%s %s %S", ISBN, title, releaseYear);
  }
}
