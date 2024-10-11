package northsussexjudo;

public class Main {
    public static void main(String [] args){

        Greetings.WelcomeMessages();
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
        if(checkedDay.isItPastSecondSaturday()){
            System.out.println("It is past 2nd Saturday of the month");
        }else{
            competition.competitionEntered(trainingPlan.getPlanLevel());
        }
        trainingPlan.PrivateCoaching();
        totalCost.calculateCost(trainingPlan,competition);
        totalCost.DisplayTotalCost();

        athletesProfile.ComparedWeight();


    }
}