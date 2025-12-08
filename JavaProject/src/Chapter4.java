import java.util.Scanner;
//Chapter 4: Continuing the Adventure!
//Inventory management!
public class Chapter4 {
    public static String inventory(String name, String proSubj) {
        System.out.println("As " + name + " opens the inventory, " + proSubj + " sees the following items:");
        String[] inventory = {"Health Flask", "Mana Potion", "Rope", "Torch"};
        for (String item : inventory) {
            System.out.println("- " + item);
        }
        System.out.println("" + name + " uses a Health Flask to restore health after the battle.");
        return "";
        }
        public static String getValidatedPhrase(Scanner in, String[] validOptions, String prompt) {
                String input;
                boolean isValid = false;

                do {
                System.out.print(prompt);
                // Consume any leftover newline
                input = in.nextLine().trim().toLowerCase();

                for (String option : validOptions) {
                        if (input.equals(option.toLowerCase())) {
                                isValid = true;
                                break;
                        }
                }
                if (!isValid) {
                        System.out.println("Invalid input. Please try again. Check your spelling.");
                }
                }           
                while (!isValid);
                return input;
        }
}
