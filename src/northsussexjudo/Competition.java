package northsussexjudo;
import java.util.*;

public class Competition {

    // Private fields to store the number of competitions entered and competition fee
    private int numberCompetition;
    private double competitionFee;

    // Method for entering competition details
    public void competitionEntered(String PlanLevel) {
        Scanner sc2 = new Scanner(System.in);

        if (PlanLevel.equals("Beginner")) {
            System.out.println("Beginner can't enter the competitions");
            return;  // Exit the method if the user is a beginner
        }

        System.out.println("Enter the number of the competitions you entered this month");

            // Loop to validate the input for the number of competitions
            while (true) {
                if (sc2.hasNextInt()) {
                    numberCompetition = sc2.nextInt();

                    // Calculate the competition fee based on the number of competitions
                    competitionFee = numberCompetition * 22;
                    System.out.println("Competition Entered this Month: " + numberCompetition);
                    break;  // Exit the loop if the input is valid
                } else {
                    System.out.println("Invalid Input Try again.");
                    sc2.next();
                }
            }






    }
    // Getter method to retrieve and calculated competition fee
    public double getCompetitionFee(){
        return competitionFee;
    }
}
