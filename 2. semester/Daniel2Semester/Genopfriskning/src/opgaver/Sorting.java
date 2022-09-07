package opgaver;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
  public void sort() {
    ArrayList<String > words = new ArrayList<String>();
    words.add("abekat");
    words.add("musefælde");
    words.add("solskin");
    words.add("slut");
    words.add("abekat");
    
    Collections.sort(words);
    Collections.reverse(words);
    
    
    for (String word:words) {
      System.out.println(word);
    }
  }
  
  public static void main(String[] args) {
    new Sorting().sort();
  }
  
}
