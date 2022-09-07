import java.util.HashMap;
import java.util.Map;

public class HashMapExercises {
    public static void main(String[] args) {
        // 1
        Map<String, Integer> people = new HashMap<>();
        people.put("A", 25);
        people.put("B", 26);
        people.put("C", 27);
        people.put("D", 28);
        people.put("E", 25);


        // 2
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(8, "Eight");
        map.put(41, "Forty-one");
        map.put(8, "Ocho");
        map.put(18, "Eighteen");
        map.put(50, "Fifty");
        map.put(132, "OneThreeTwo");
        map.put(28, "Twenty-eight");
        map.put(79, "Seventy-nine");
        map.remove(41);
        map.remove(28);
        map.remove("Eight");
        map.put(50, "Forty-one");
        map.put(28, "18");
        map.remove(18);

    }
}
