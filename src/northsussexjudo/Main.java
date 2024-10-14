package northsussexjudo;
import java.util.*;


public class Main {
    public static void main(String [] args) {
        Greetings.WelcomeMessages();

        Scanner scan = new Scanner(System.in);
        String answer1;

        do {
            System.out.println(" ");
            System.out.println("Do you want to Register: [yes/no] ");
            answer1 = scan.nextLine();

            if(answer1.equalsIgnoreCase("yes")) {
                System.out.println("Registration Process.....");

                System.out.println(" ");
                AthletesProfile athletesProfile = new AthletesProfile();
                CheckedTheDay checkedDay = new CheckedTheDay(0);
                TrainingPlan trainingPlan = new TrainingPlan();
                Competition competition = new Competition();
                TotalCost totalCost = new TotalCost();

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
                checkedDay.displayOfDate();
                if (checkedDay.isItPastSecondSaturday()) {
                    if (checkedDay.getDay() == 12) {
                        System.out.println("It is Second Saturday of the Month");
                        System.out.println(" You can Enter the Competition");
                        competition.competitionEntered(trainingPlan.getPlanLevel());
                    } else if(checkedDay.getDay() > 13 && checkedDay.getDay() <= 21){
                        System.out.println("It is 3rd week of the month");
                    }else{
                        System.out.println("It is 4th week of the month ");
                    }
                }
                trainingPlan.PrivateCoaching();
                totalCost.calculateCost(trainingPlan, competition);
                totalCost.DisplayTotalCost(trainingPlan, competition,athletesProfile);

                athletesProfile.ComparedWeight();

                break;
            } else if (answer1.equalsIgnoreCase("no")) {
                    System.out.println("\u001B[31m-------- Thank you! Goodbye.---------");
                    break;
                }else{
                System.out.println("Invalid Input Try Again. Please enter only [yes/no]");
                }


        }while(true);
    }
}