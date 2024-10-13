package northsussexjudo;
import java.util.*;

public class Competition {

    private int numberCompetition;
    private double competitionFee;

    public void competitionEntered(String PlanLevel){
        Scanner sc2 = new Scanner(System.in);

        if(PlanLevel.equals("Beginner")){
            System.out.println("Beginner can't enter the competitions");
            return;
        }

        System.out.println("Enter the number of the competitions you entered this month");


            while(true){
                if(sc2.hasNextInt()){
                    numberCompetition = sc2.nextInt();
                    competitionFee = numberCompetition * 22;
                    System.out.println("Competition Entered this Month: " + numberCompetition);
                    break;
                }else{
                    System.out.println("Invalid Input Try again.");
                    sc2.next();
                }
            }






    }
    public double getCompetitionFee(){
        return competitionFee;
    }
}
