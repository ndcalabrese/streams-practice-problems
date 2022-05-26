package user_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private ArrayList<String> userInput;
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.userInput = new ArrayList<>();
    }

    public void requestNumbers() {
        while (true) {
            System.out.println("Enter a number. Enter END when finished: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("END")) {
                break;
            } else {
                userInput.add(input);
            }

        }
    }

    public boolean requestChoice() {
        boolean requestsPosNumbers = false;

        while (true) {
            System.out.print("Print the average of the negative" +
                    "numbers or the positive numbers? (n/p): ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("N")) {
                break;
            } else if (input.equalsIgnoreCase("P")) {
                requestsPosNumbers = true;
                break;
            }
        }

        return requestsPosNumbers;
    }

    public void requestStrings() {
        while (true) {
            System.out.println("Enter a line of text. Enter nothing when finished: ");

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            } else {
                userInput.add(input);
            }
        }
    }

    public void requestPosNumbers() {
        while (true) {
            System.out.println("Enter a positive number. Enter a negative number when finished:");

            String input = scanner.nextLine();

            if (isNumeric(input)) {
                if (Double.parseDouble(input) < 0) {
                    break;
                }
            }
            userInput.add(input);
        }
    }

    public ArrayList<Person> requestPersonalInfo() {
        ArrayList<Person> people = new ArrayList<>();
        while (true) {

            System.out.println("Continue personal information input? Enter \"quit\" when finished:");
            System.out.print("Input first name: ");

            String firstName = scanner.nextLine();

            if (firstName.equalsIgnoreCase("QUIT")) {
                break;
            }

            System.out.print("Input last name: ");

            String lastName = scanner.nextLine();

            int birthYear;

            while (true) {
                System.out.print("Input the year of birth: ");
                String birthYearString = scanner.nextLine();
                if (isNumeric(birthYearString)) {
                    birthYear = Integer.parseInt(birthYearString);
                    break;
                }
            }

            people.add(new Person(firstName, lastName, birthYear));

        }

       return people;
    }

    public ArrayList<String> getUserInput() {
        return userInput;
    }

    public static boolean isNumeric(String amountInput) {
        try {
            Double.parseDouble(amountInput);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

}
