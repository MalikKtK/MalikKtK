

import com.github.javafaker.Faker;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Map exercise
    List<String> randomDishes = NameGenerator.getRandomNamesDishes(100);
    // The contains3 method you have to write! So that if the randomDishes list contains a word at least 3 times then it returns true other wise false.
    
    Boolean contain3 = HashMapExercise.contains3(randomDishes);
    
    System.out.println(randomDishes);
    System.out.printf("%s%n%n", contain3);
    
    
    // Set exercise!
    List<String> randomNames1 = NameGenerator.getRandomNamesList(100);
    List<String> randomNames2 = NameGenerator.getRandomNamesList(100);
    
    Collections.sort(randomNames1);
    Collections.sort(randomNames2);
    
    // create union
    Set<String> nameUnion = new HashSet<>();
    nameUnion.addAll(randomNames1);
    nameUnion.addAll(randomNames2);
    
    // create difference
    Set<String> difference = new HashSet<>();
    difference.addAll(randomNames1);
    difference.removeAll(randomNames2);
    
    System.out.printf("size of randomNames1 %s - %s%n%n", randomNames1.size(), randomNames1);
    System.out.printf("size of randomNames2 %s - %s%n%n", randomNames2.size(), randomNames2);
    System.out.printf("size of union %s - %s%n%n", nameUnion.size(), nameUnion);
    System.out.printf("size of Random1's difference from Random2  %s - %s%n", difference.size(), difference);
  }
}
