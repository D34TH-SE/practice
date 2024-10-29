package northsussexjudo;
import java.util.*;

public class TrainingPlan {

    // Private fields to store training plan level, coaching hours, and plan fee
    private String planLevel;
    private double coachingHours;
    private double planFee;

    // Method for selecting a training plan
    public void userSelectTrainingPlan() {
        Scanner sc = new Scanner(System.in);
        int choice1;

        // Loop to ensure a valid choice is made
        while (true) {
            System.out.println("Select you Training Plan");
            System.out.println("1. Beginner");
            System.out.println("2. Intermediate");
            System.out.println("3. Elite");

            if (sc.hasNextInt()) {
                choice1 = sc.nextInt();

                // Determines the selected plan based on user input
                switch (choice1) {
                    case 1:
                        planLevel = "Beginner";
                        planFee = 25.00;
                        System.out.println("Beginner");
                        break;
                    case 2:
                        planLevel = "Intermediate";
                        planFee = 30.00;
                        System.out.println("Intermediate");
                        break;
                    case 3:
                        planLevel = "Elite";
                        planFee = 35.00;
                        System.out.println("Elite");
                        break;
                    default:
                        System.out.println(" Invalid Input Try Again");
                        continue;  // Repeats the loop if the input is invalid

                }
                break; // Exit loops if a valid option is chosen

            } else {
                System.out.println("Invalid Input " + "[Enter only (1,2,3)]");
                sc.next(); // Clears invalid input and prompts again
            }


        }


    }
    // Method for entering private coaching hours
    public void PrivateCoaching(){

        Scanner sc1 = new Scanner(System.in);

        // Loop to validate the input for private coaching hours
        while (true) {

            System.out.println("Enter your hour for private coaching: " + "[If you don't want private coaching just put (0)]"  );


            if (sc1.hasNextInt()) {
                coachingHours = sc1.nextInt();

                // Validates if the coaching hours are within the acceptable range
                if (coachingHours >= 0 && coachingHours <= 5) {
                    System.out.println("Coaching hours is: " + coachingHours +" Hours");
                    break;
                } else {
                    System.out.println("Invalid Input Try Again,Do not enter a negative number or Higher Than (1-5)");
                }

            } else {
                System.out.println("Invalid input not a number ");
                sc1.next();
            }

        }
    }
    // Getter methods to access private fields outside this class
    public String getPlanLevel(){
        return planLevel;
    }
    public double getPlanFee(){
        return planFee;
    }
    public double getCoachingHours(){
        return coachingHours;
    }

}