package opgaver;

import java.util.ArrayList;
import java.util.Arrays;

public class Søgning {
  public int søg(ArrayList<String> strings, String find) {
    return strings.indexOf(find);
  }
  
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "c"));
    Søgning søgning = new Søgning();
  
    System.out.println(søgning.søg(words, "b"));
    System.out.println(søgning.søg(words, "q"));
  }
}
