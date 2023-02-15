import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class NameGenerator {
    private static Faker faker = new Faker();

    static List<String> getRandomNamesList(Integer numberOfNames) {
        List<String> randomNames = new ArrayList<>();
        for (int i = 0; i < numberOfNames; i++) {

            randomNames.add(faker.name().firstName());
        }
        return randomNames;
    }

    static List<String> getRandomNamesDishes(Integer numberOfNames) {
        List<String> randomNames = new ArrayList<>();
        for (int i = 0; i < numberOfNames; i++) {

            randomNames.add(faker.food().dish().toString());
        }
        return randomNames;
    }

}
