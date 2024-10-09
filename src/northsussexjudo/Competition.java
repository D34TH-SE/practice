package northsussexjudo;
import java.util.*;

public class Competition {

    private int numberCompetition;
    private double competitionFee;

    public void competitionEntered(String PlanLevel){
        Scanner sc2 = new Scanner(System.in);

        if(PlanLevel.equals("Beginner")){
            System.out.println("Beginner can't compete");
            return;
        }
        System.out.println("Enter the competitions you entered this month");
        numberCompetition = sc2.nextInt();

        competitionFee = numberCompetition * 50;

    }
    public double getCompetitionFee(){
        return competitionFee;
    }
}
