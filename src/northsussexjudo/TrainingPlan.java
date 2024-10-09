package northsussexjudo;
import java.util.*;

public class TrainingPlan {

    private String PlanLevel;
    private double CoachingHours;
    private double PlanFee;

    public void userSelectTrainingPlan(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Select you Training Plan");
            System.out.println("1. Beginner");
            System.out.println("2. Intermediate");
            System.out.println("3. Elite");

            int choice1 = sc.nextInt();

            switch (choice1){
                case 1:
                    PlanLevel = "Beginner";
                    PlanFee = 25.00;
                    System.out.println("Beginner");
                    break;
                case 2:
                    PlanLevel = "Intermediate";
                    PlanFee = 30.00;
                    System.out.println("Intermediate");
                    break;
                case 3:
                    PlanLevel = "Elite";
                    PlanFee = 35.00;
                    System.out.println("Elite");
                    break;
                default:
                    System.out.println(" Invalid Input Try Again");
                    continue;

            }
            break;


        }


    }
    public void PrivateCoaching(){

        Scanner sc1 = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your hour for private coaching: ");


            if(CoachingHours <= 5 && sc1.hasNextDouble()) {
                System.out.println("Coaching Hours Processing.....");
                CoachingHours = sc1.nextDouble();
                break;
            }else{
                System.out.println("----ERROR---- Invalid Input Try Again");

            }

        }
    }
    public String getPlanLevel(){
        return PlanLevel;
    }
    public double PlanFee(){
        return PlanFee;
    }
    public double getCoachingHours(){
        return CoachingHours;
    }

}
