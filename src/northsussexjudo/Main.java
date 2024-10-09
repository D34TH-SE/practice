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
        trainingPlan.userSelectTrainingPlan();
        athletesProfile.inputWeightCategory();
        athletesProfile.EnterCurrentWeight();

        trainingPlan.PrivateCoaching();
        totalCost.calculateCost(trainingPlan,competition);
        totalCost.


    }
}
