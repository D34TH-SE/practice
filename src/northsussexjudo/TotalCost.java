package northsussexjudo;

public class TotalCost {

    private double totalCost;

        public void calculateCost(TrainingPlan trainingPlan,Competition competition){
            totalCost = trainingPlan.getPlanFee()*4+ competition.getCompetitionFee() + (trainingPlan.getCoachingHours()*9);
    }

    public void DisplayTotalCost(TrainingPlan trainingPlan, Competition competition,AthletesProfile athletesProfile){



        System.out.println("========= Total Cost ==========");

        System.out.println("Your Name: " + athletesProfile.getAthleteName());


        System.out.printf("Training Plan Fee : $%.2f\n",trainingPlan.getPlanFee()*4);
        System.out.printf("Competition Fee : $%.2f\n",competition.getCompetitionFee());
        System.out.printf("Private Coaching Hours Fee : $%.2f\n",trainingPlan.getCoachingHours()*9) ;
        System.out.printf("Total Cost : $%.2f\n",totalCost);

    }
}
