package opgaver;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Opg {
  public void kvadrat(int number, String tegn) {
    for (int x = 0; x < number; x++) {
      for (int i = 0; i < number; i++) {
        System.out.printf("%s  ", tegn);
      }
      System.out.println();
    }
  }
  
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
  
  public void sorting() {
    ArrayList<String > words = new ArrayList<String>();
    words.add("abekat");
    words.add("musefælde");
    words.add("solskin");
    words.add("slut");
    words.add("abekat");
  
    Collections.sort(words);
    Collections.reverse(words);
  
    System.out.println(words);
  }
  
  public int find(ArrayList<String> strings, String find) {
    int index = strings.indexOf(find);
    // System.out.println(index);
    
    if (index == -1) {
      throw new RuntimeException();
    }
    
    return index;
  }
  
  public static void main(String[] Args) {
    Opg opg = new Opg();
    ArrayList<String> strings = new ArrayList<>();
    strings.add("b");
    strings.add("b");
    strings.add("a");
    strings.add("b");
    strings.add("b");
    //opg.kvadrat(6, "'");
    //opg.ProperCase("AAA abcd BBB bb CAn WE SeE loongword");
    //opg.sorting();
    
    try {
      System.out.println(opg.find(strings, "a"));
    } catch (RuntimeException e) {
      System.out.println(e);
    }
  }
  
}
