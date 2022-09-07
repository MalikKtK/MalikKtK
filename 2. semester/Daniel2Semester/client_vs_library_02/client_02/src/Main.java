public class Main {
  public static void main(String[] args) {
    Library library = new Library();
    var result = library.doesBookExist(new Book("War Thunder", "John Doe", "123456789", 2019));
    System.out.println(result);



  }
}