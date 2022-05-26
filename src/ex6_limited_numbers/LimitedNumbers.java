package ex6_limited_numbers;

import user_interface.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class LimitedNumbers {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();

        ui.requestPosNumbers();

        ArrayList<Double> numbers = storeInputNumbers(ui.getUserInput());

        System.out.println();
        System.out.println("Numbers between 1 and 5: ");

        for ( double number : getNumbersBetweenOneAndFive(numbers) ) {
            System.out.println(number);
        }

    }

    public static ArrayList<Double> getNumbersBetweenOneAndFive(List<Double> numbers) {
        ArrayList<Double> numbersBetweenOneAndFive = new ArrayList<>();
        numbers.stream()
                .filter(number ->
                        (number >= 1 && number <= 5))
                .forEach(numbersBetweenOneAndFive::add);
        return numbersBetweenOneAndFive;

    }

    public static ArrayList<Double> storeInputNumbers(ArrayList<String> inputs) {
        ArrayList<Double> inputNumbers = new ArrayList<>();
        inputs.stream()
                .filter(UserInterface::isNumeric)
                .mapToDouble(Double::valueOf)
                .forEach(inputNumbers::add);

        return inputNumbers;
    }

}
