package northsussexjudo;

public class TotalCost {

    private double totalCost;

        public void calculateCost(TrainingPlan trainingPlan,Competition competition){
            totalCost = trainingPlan.PlanFee() + competition.getCompetitionFee() + (trainingPlan.getCoachingHours() *9);
    }
    public void DisplayTotalCost(){
        System.out.println(totalCost);
    }
}
