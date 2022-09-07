import java.util.HashMap;
import java.util.List;

public class HashMapExercise {
  public static Boolean contains3(List<String> strings) {
    // You have to use a HashMap here!!!
    // https://giphy.com/gifs/qt-quiktrip-snackle-L0HIznJ2hn4WndRshY
    HashMap<String, Integer> occurance = new HashMap<String, Integer>();
    
    for (String string : strings) {
      occurance.merge(string, 1, Integer::sum);
      if (occurance.get(string) >= 3) return true;
    }
    
    return false;
  }
}
