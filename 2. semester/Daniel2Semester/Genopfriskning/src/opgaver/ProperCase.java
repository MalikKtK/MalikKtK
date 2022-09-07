package opgaver;

public class ProperCase {
  public void ProperCase(String sentence) {
    String[] words = sentence.split(" ");
    String regEx = "[A-Z]*";
    
    for (String word : words) {
      if (word.matches(regEx)) System.out.print(word + " ");
      else if (word.length() > 3) {
        System.out.print(
            word.substring(0, 1).toUpperCase() +
            word.substring(1, word.length()).toLowerCase() + " ");
      } else if (word.length() <= 3) {
        System.out.print(word.toLowerCase() + " ");
      }
    }
  }
  
  public static void main(String[] args) {
    new ProperCase().ProperCase("AAA abcd BBB bb CAn WE SeE loonGWord");
  }
  
}
