package ex3_positive_numbers;

import ex4_divisible.Divisible;
import user_interface.UserInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();

        ui.requestNumbers();

        List<Integer> numbers = Divisible.storeInputNumbers(ui.getUserInput());

        System.out.println();
        System.out.println("Positive numbers:");
        for ( double number : positive(numbers) ) {
            System.out.println(number);
        }


    }

    public static List<Integer> positive(List<Integer> numbers) {

        return numbers.stream()
                .filter(number ->
                        (number > 0))
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
