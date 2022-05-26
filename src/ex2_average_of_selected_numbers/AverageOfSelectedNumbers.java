package ex2_average_of_selected_numbers;

import user_interface.UserInterface;
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();

        ui.requestNumbers();

        if (ui.requestChoice()) {
            // User wants positive numbers
            System.out.println("Average of the positive numbers: "
            + average(ui.getUserInput(), true));
        } else {
            // User wants negative numbers
            System.out.println("Average of the positive numbers: "
                    + average(ui.getUserInput(), false));
        }

    }

    public static double average(ArrayList<String> inputs, boolean posNumbers) {
        double average = 0;
        Stream<String> stream = posNumbers
                ? inputs.stream().filter(UserInterface::isNumeric).filter(input -> Double.parseDouble(input) > 0)
                : inputs.stream().filter(UserInterface::isNumeric).filter(input -> Double.parseDouble(input) < 0);

        OptionalDouble doubleStream = stream.mapToDouble(Double::valueOf)
                .average();

        if (doubleStream.isPresent()) {
            average = doubleStream.getAsDouble();
        }

        return average;
    }

}
