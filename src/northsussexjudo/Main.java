package northsussexjudo;
import java.util.*;


public class Main {
    public static void main (String [] args) {
        // Call the Greeting method to display the welcome messages
        Greetings.WelcomeMessages();

        // Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        String answer1;

        // Loop to ask the user if they want to register
        do {
            System.out.println(" ");
            System.out.println("Do you want to Register: [yes/no] ");
            answer1 = scan.nextLine();

            // Checks if the input is "yes" or "Yes (case-insensitive)
            if (answer1.equalsIgnoreCase("yes")) {
                System.out.println("Registration Process.....");

                System.out.println(" ");
                AthletesProfile athletesProfile = new AthletesProfile();
                CheckedTheDay checkedDay = new CheckedTheDay(0);
                TrainingPlan trainingPlan = new TrainingPlan();
                Competition competition = new Competition();
                TotalCost totalCost = new TotalCost();

                // Calls methods to input the athlete's details and training preferences
                athletesProfile.inputAthleteName();
                System.out.println(" ");
                trainingPlan.userSelectTrainingPlan();
                System.out.println(" ");
                athletesProfile.inputWeightCategory();
                System.out.println(" ");
                athletesProfile.EnterCurrentWeight();
                System.out.println(" ");
                checkedDay.InputTheCurrentDay();
                System.out.println(" ");
                checkedDay.displayOfDate(); // Displays the inputted date
                if (checkedDay.isItPastSecondSaturday()) {
                    if (checkedDay.getDay() <= 12) {
                        System.out.println("You can Enter the Competition");
                        competition.competitionEntered(trainingPlan.getPlanLevel());
                    } else if (checkedDay.getDay() > 13 && checkedDay.getDay() <= 21){
                        System.out.println("It is 3rd week of the month");
                    } else {
                        System.out.println("It is 4th week of the month ");
                    }
                }

                // Checks for private coaching options
                trainingPlan.PrivateCoaching();

                // Calculate and displays the total cost based on the training plan and competition
                totalCost.calculateCost(trainingPlan, competition);
                totalCost.DisplayTotalCost(trainingPlan, competition,athletesProfile);

                // Comparing and display the current weight and the chosen weight category
                athletesProfile.ComparedWeight();

                break;
            } else if (answer1.equalsIgnoreCase("no")) {
                // If the user input "no" , display thank you message and exit
                System.out.println("\u001B[31m-------- Thank you! Goodbye.---------");
                break;
            } else {

                // Handles invalid inputs by prompting the user to enter "yes" or "no" only
                System.out.println("Invalid Input Try Again. Please enter only [yes/no]");
            }


        } while (true); // Loop will continue until a "break" is encountered
    }
}