package ex4_divisible;

import user_interface.UserInterface;
import java.util.ArrayList;

public class Divisible {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.requestNumbers();

        ArrayList<Integer> numbers = storeInputNumbers(ui.getUserInput());
        System.out.println("Here are the numbers divisible by 2, 3, or 5:");
        for (int number : divisible(numbers)) {
            System.out.println(number);
        }
    }

    public static ArrayList<Integer> storeInputNumbers(ArrayList<String> inputs) {
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        inputs.stream()
                .filter(UserInterface::isNumeric)
                .mapToInt(Integer::valueOf)
                .forEach(inputNumbers::add);

        return inputNumbers;
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> divisibleNumbers = new ArrayList<>();
        numbers.stream()
                .filter(number ->
                        (number % 2 == 0 || number % 3 == 0 || number % 5 == 0))
                .forEach(divisibleNumbers::add);

        return divisibleNumbers;
    }
}
