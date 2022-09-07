public class Book {
  private String title;
  private String author;
  private String isbn;
  private int year;
  
  public Book(String title, String author, String isbn, int year) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.year = year;
  }
  
  // Getter and Setters for all Fields (attributes)
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getAuthor() {
    return author;
  }
  
  public void setAuthor(String author) {
    this.author = author;
  }
  
  public String getIsbn() {
    return isbn;
  }
  
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
  
  public int getYear() {
    return year;
  }
  
  public void setYear(int year) {
    this.year = year;
  }
}
