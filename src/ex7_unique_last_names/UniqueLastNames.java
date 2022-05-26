package ex7_unique_last_names;

import user_interface.Person;
import user_interface.UserInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueLastNames {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();

        ArrayList<Person> people = ui.requestPersonalInfo();
        ArrayList<String> lastNames = new ArrayList<>();

        System.out.println();
        System.out.println("Unique last names in alphabetical order:");

        for ( Person person : people ) {
            lastNames.add(person.getLastName());
        }

        for ( String lastName : alphabetize(lastNames) ) {
            System.out.println(lastName);
        }

    }

    public static List<String> alphabetize(ArrayList<String> lastNames) {

        return lastNames.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
