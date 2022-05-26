package ex1_average_of_numbers;

import user_interface.UserInterface;
import java.util.ArrayList;
import java.util.OptionalDouble;

public class AverageOfNumbers {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.requestNumbers();
        System.out.println("The average is: " + average(ui.getUserInput()));
    }

    public static double average(ArrayList<String> inputs) {
        double average = 0;
        OptionalDouble streamAvg = inputs
                .stream()
                .filter(UserInterface::isNumeric)
                .mapToDouble(Double::valueOf)
                .average();

        if (streamAvg.isPresent()) {
            average = streamAvg.getAsDouble();
        }

        return average;
    }

}
