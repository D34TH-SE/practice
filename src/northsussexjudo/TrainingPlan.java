package northsussexjudo;
import java.util.*;

public class TrainingPlan {

    private String PlanLevel;
    private double CoachingHours;
    private double PlanFee;

    public void userSelectTrainingPlan(){
        Scanner sc = new Scanner(System.in);
        int choice1;

        while(true){
            System.out.println("Select you Training Plan");
            System.out.println("1. Beginner");
            System.out.println("2. Intermediate");
            System.out.println("3. Elite");

            if(sc.hasNextInt()) {
                choice1 = sc.nextInt();

                switch (choice1) {
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

            }else{
                System.out.println("Invalid Input " + "[Enter only (1,2,3)]");
                sc.next();
            }


        }


    }
    public void PrivateCoaching(){

        Scanner sc1 = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your hour for private coaching: " + "[If you don't want private coaching just put (0)]"  );


            if(sc1.hasNextInt()){
                CoachingHours = sc1.nextInt();

                if(CoachingHours >= 0 && CoachingHours <= 5){
                    System.out.println("Coaching hours is: " + CoachingHours +" Hours");
                    break;
                }else{
                    System.out.println("Invalid Input Try Again,Do not enter a negative number or Higher Than (1-5)");
                }

            }else{
                System.out.println("Invalid input not a number ");
                sc1.next();
            }

        }
    }
    public String getPlanLevel(){
        return PlanLevel;
    }
    public double getPlanFee(){
        return PlanFee;
    }
    public double getCoachingHours(){
        return CoachingHours;
    }

}