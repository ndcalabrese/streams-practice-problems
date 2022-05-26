package ex5_printing_user_input;

import user_interface.UserInterface;

public class PrintingUserInput {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();

        ui.requestStrings();
        System.out.println();
        for (String input : ui.getUserInput()) {
            System.out.println(input);
        }

    }

}
