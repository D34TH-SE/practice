package northsussexjudo;
import java.util.*;

public class AthletesProfile {

    // Private fields to store athlete details
    private String athleteName;
    private String weightCategory;
    private int currentWeight;

    // Method to input the athlete's name with validation
    public void inputAthleteName() {
        Scanner input = new Scanner(System.in);
        boolean nameIsValid;

        // Loop until a valid name is entered
        do {
            System.out.println ("Enter Your Name: " + "[First Name,Last Name,Suffix]");
            athleteName= input.nextLine();
            nameIsValid = validationName(athleteName); // Validate the entered name

            if (!nameIsValid){
                System.out.println("Invalid Input Try Again");
            }
        } while (!nameIsValid); // Continue until the input is valid
        System.out.println("Proceeding.......");
    }
    // Private method to validate that the name does not contain numbers or symbols
    private boolean validationName (String input) {
        boolean hasNumbers = false;
        boolean hasSymbols = false;

        // Iterate through each character input by the user
        for (char ch : input.toCharArray()) {

            if (Character.isDigit(ch)) {
                hasNumbers = true; // Set flag is a digit is found
            }
            // Combine this two to get the symbol
            else if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                hasSymbols = true;  // Set flag if a symbol is found
            }
        }
        // Return true only if the input contains no numbers and no symbols
        return !hasNumbers && !hasSymbols;
    }

    public void inputWeightCategory() {
        Scanner input = new Scanner(System.in);
        int choice;

        // Loop until a valid choice is made
        while (true) {
            System.out.println("Select your weight category: ");
            System.out.println("1. Heavyweight");
            System.out.println("2. Light-Heavyweight");
            System.out.println("3. Middleweight");
            System.out.println("4. Light-Middleweight");
            System.out.println("5. Lightweight");
            System.out.println("6. Flyweight");

            // Check if the user has entered an integer
            if (input.hasNextInt()) {
                choice = input.nextInt();

                // Determine the weight category based on the users choice
                switch (choice) {
                    case 1:
                        weightCategory = "Heavyweight [Above 100kg]";
                        System.out.println("You choose \"Heavyweight\"");
                        break;
                    case 2:
                        weightCategory = "Light-Heavyweight [100kg]";
                        System.out.println("You choose \"Light-Heavyweight\"");
                        break;
                    case 3:
                        weightCategory = "Middleweight [90kg]";
                        System.out.println("You choose \"Middleweight\"");
                        break;
                    case 4:
                        weightCategory = "Light-Middleweight [81kg]";
                        System.out.println("You choose \"Light-Middleweight\"");
                        break;
                    case 5:
                        weightCategory = "Lightweight [73kg]";
                        System.out.println("You choose \"Lightweight\"");
                        break;
                    case 6:
                        weightCategory = "Flyweight [66kg]";
                        System.out.println("You choose \"Flyweight\"");
                        break;
                    default:
                        System.out.println("Invalid Input Try Again");
                        continue; // Ask for input again if the choice is invalid
                }
                break; // Exit the loop if valid choice is made
            } else {
                // If input is not an integer, diplay an error message Only (1-6)
                System.out.println("Invalid Input " + "[Enter only (1,2,3,4,5,6)] ");
                input.next();  // Clear the invalid input
            }
        }
    }
    // Method to input the athlete's current weight with validation
    public void enterCurrentWeight() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Current Weight");

        while (true) { // Loop until a valid weight is entered
            if (input.hasNextInt()){
                currentWeight = input.nextInt();

                // Check the weight if is not negative
                if (currentWeight >= 0) {
                        System.out.println("Your current weight is: " + currentWeight + "kg");
                        break; // Exit the loop if weight is valid
                } else {
                        System.out.println("Invalid Input Don't Enter Negative Number");
                }
            } else {
                // Display and error message if the user input non integer
                System.out.println("Invalid Input Try Again");
                input.next();
            }

        }

    }
    // Method to compare and display the athlete's weight category and current weight
    public void ComparedWeight() {
        System.out.println("Comparing Your weight category [" + weightCategory + "] vs " +  " Your current weight [" + currentWeight +"kg]");
    }
    // Getter method to return the athlete's name
    public String getAthleteName() {
        return athleteName;
    }
}