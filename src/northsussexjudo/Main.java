package northsussexjudo;

public class Main {
    public static void main(String [] args){

        Greetings.WelcomeMessages();
        System.out.println(" ");
        AthletesProfile athletesProfile = new AthletesProfile();
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
        trainingPlan.PrivateCoaching();
        totalCost.calculateCost(trainingPlan,competition);
        totalCost.DisplayTotalCost();

        athletesProfile.ComparedWeight();


    }
}
