package opgaver;

public class Kvadrat {
  
  public void print(int number, String tegn) {
    for (int x = 0; x < number; x++) {
      for (int i = 0; i < number; i++) {
        System.out.printf("%s  ", tegn);
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    new Kvadrat().print(6, "*");
  }
}
