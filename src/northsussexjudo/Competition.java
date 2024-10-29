package northsussexjudo;
import java.util.*;

public class Competition {

    // Private fields to store the number of competitions entered and the total competition fee
    private int numberCompetition;
    private double competitionFee;

    // Method for entering competition details, The plan level as a parameter
    public void competitionEntered (String PlanLevel) {
        Scanner sc2 = new Scanner(System.in);

        // Check if the user is a beginner, because beginner cannot enter the competition
        if (PlanLevel.equals("Beginner")) {
            System.out.println("Beginner can't enter the competitions");
            return;  // Exit the method if the user is a beginner
        }

        System.out.println("Enter the number of the competitions you entered this month");

            // Loop to validate the input for the number of competitions
            while (true) {
                if (sc2.hasNextInt()) {
                    numberCompetition = sc2.nextInt();
                    competitionFee = numberCompetition * 22;
                    System.out.println("Competition Entered this Month: " + numberCompetition);
                    break; // Exit loop if a valid number is entered
                } else {
                    System.out.println("Invalid Input Try again.");
                    sc2.next(); // Clear the invalid input
                }
            }






    } // Getter method to retrieve the calculated competition fee
    public double getCompetitionFee(){
        return competitionFee;
    }
}
