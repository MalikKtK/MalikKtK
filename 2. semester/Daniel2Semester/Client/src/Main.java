public class Main {
  public static void main(String[] args) {
    Library library = new Library();
    Boolean exists = library.doesBookExist(new Book("abc", "author", "11", 2020));
    System.out.println(exists);
    
  }
}
