

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Map exercise
        List<String> randomDishes = NameGenerator.getRandomNamesDishes(100);
        // The contains3 method you have to write! So that if the randomDishes list contains a word at least 3 times then it returns true other wise false.
        HashMapExercise.contains3(randomDishes);


        // Set exercise!
        List<String> randomNames1 = NameGenerator.getRandomNamesList(100);
        List<String> randomNames2 = NameGenerator.getRandomNamesList(100);

        System.out.println(randomNames1);


    }
}
