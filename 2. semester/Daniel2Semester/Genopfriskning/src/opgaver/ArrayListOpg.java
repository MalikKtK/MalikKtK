package opgaver;

import java.util.ArrayList;

public class ArrayListOpg {
  
  public boolean doesArraylistContainString(ArrayList<Character> bigChar, String smallStr) {
    StringBuilder bigStr = new StringBuilder();
    for (Character c : bigChar) bigStr.append(c);
    
    boolean doesContain = bigStr.toString().contains(smallStr);
    
    if (!doesContain) {
      char[] smallChar = smallStr.toCharArray();
      for (Character c : smallChar)
        bigChar.add(c);
    }
    
    return doesContain;
  }
  
  public static void main(String[] args) {
    ArrayListOpg arrayListOpg = new ArrayListOpg();
    ArrayList<Character> bigChar = new ArrayList<Character>();
    String smallStr = "abc";
    bigChar.add('a');
    bigChar.add('b');
    bigChar.add('d');
    bigChar.add('d');
  
    System.out.println(smallStr + " - smallStr");
    System.out.println(bigChar + " - bigChar");
    System.out.printf("[%s] contained%n", arrayListOpg.doesArraylistContainString(bigChar, smallStr));
    System.out.println(bigChar + " - bigChar [AFTER]");
  }
}
