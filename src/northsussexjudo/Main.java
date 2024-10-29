package northsussexjudo;
import java.util.*;


public class Main {
    public static void main(String [] args) {
        // Calls a method from the Greetings class to display welcome messages
        Greetings.WelcomeMessages();

        // This is a scanner object to take user input
        Scanner scan = new Scanner(System.in);
        String answer1;

        // Starts a loop to ask the user if they want to register
        do {
            System.out.println(" ");
            System.out.println("Do you want to Register: [yes/no] ");
            answer1 = scan.nextLine();

            // Checks if the input is "yes" or "Yes" it doesn't matter case insensitive
            if (answer1.equalsIgnoreCase("yes")) {
                System.out.println("Registration Process.....");

                System.out.println(" ");
                AthletesProfile athletesProfile = new AthletesProfile();
                CheckTheDay checkedDay = new CheckTheDay(0);
                TrainingPlan trainingPlan = new TrainingPlan();
                Competition competition = new Competition();
                TotalCost totalCost = new TotalCost();

                // Calls method to input the athelete's details and training preferences
                athletesProfile.inputAthleteName();
                System.out.println(" ");
                trainingPlan.userSelectTrainingPlan();
                System.out.println(" ");
                athletesProfile.inputWeightCategory();
                System.out.println(" ");
                athletesProfile.enterCurrentWeight();
                System.out.println(" ");
                checkedDay.inputTheCurrentDay();
                System.out.println(" ");
                checkedDay.displayOfDate();
                if (checkedDay.isItPastSecondSaturday()) {
                    if (checkedDay.getDay() <= 12) {
                        System.out.println("You can Enter the Competition");
                        competition.competitionEntered(trainingPlan.getPlanLevel());
                    } else if(checkedDay.getDay() > 13 && checkedDay.getDay() <= 21){
                        System.out.println("It is 3rd week of the month");
                    }else{
                        System.out.println("It is 4th week of the month ");
                    }
                }
                // Checks for Private Coaching Hours
                trainingPlan.PrivateCoaching();
                // Calculates and display the total cost
                totalCost.calculateCost(trainingPlan, competition);
                totalCost.DisplayTotalCost(trainingPlan, competition,athletesProfile);

                // Compare and Display the Current weight and the chosen weight of the client
                athletesProfile.ComparedWeight();

                break; // Exit the loop after completing registration

            } else if (answer1.equalsIgnoreCase("no")) {
                // If the user inputs "no" Display the thank-you message and exit
                System.out.println("\u001B[31m-------- Thank you! Goodbye.---------");
                break;
            } else{
                System.out.println("Invalid Input Try Again. Please enter only [yes/no]");
            }


        } while(true); // Loop will continue until a "break" is encountered
    }
}