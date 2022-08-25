package opgaver;

import java.util.ArrayList;
import java.util.Collections;

public class DoContain {
  public boolean doesArraylistContainString(ArrayList<Character> bigChar, String smallStr) {
    StringBuilder bigStr = new StringBuilder();
    for (Character c : bigChar) bigStr.append(c);
    
    boolean contains = bigStr.toString().contains(smallStr);
    
    if (!contains) {
      char[] smallChar = smallStr.toCharArray();
      for (Character c : smallChar) bigChar.add(c);
    }
    
    System.out.println(bigStr + " <- bigStr");
    return contains;
  }
  
  public static void main(String[] args) {
    ArrayList<Character> bigChar = new ArrayList<Character>();
    String smallStr = "abc";
    bigChar.add('a');
    bigChar.add('b');
    bigChar.add('d');
    
    DoContain doContain = new DoContain();
    
    System.out.println(Collections.unmodifiableList(bigChar));
    System.out.println(doContain.doesArraylistContainString(bigChar, smallStr));
    System.out.println(Collections.unmodifiableList(bigChar));
  }
}
