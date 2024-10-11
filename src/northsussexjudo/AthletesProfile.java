package northsussexjudo;
import java.util.*;

public class AthletesProfile {

    private String athleteName;
    private String weightCategory;
    private int currentWeight;

    public void inputAthleteName(){
        Scanner input = new Scanner(System.in);
        boolean nameIsValid;

        do {
            System.out.println("Enter Your Name: " + "[First Name,Last Name,Suffix]");
            athleteName= input.nextLine();
            nameIsValid = true;

            for(int i = 0; i < athleteName.length(); i++){
                if(Character.isDigit(athleteName.charAt(i))){
                    nameIsValid = false;
                    break;
                }
            }
            if(!nameIsValid){
                System.out.println("Invalid Input Try Again");
            }
        }while(!nameIsValid);
        System.out.println("Proceeding.......");
    }
    public void inputWeightCategory(){
        Scanner input = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("Select your weight category: ");
            System.out.println("1. Lightweight");
            System.out.println("2. Middleweight");
            System.out.println("3. Heavyweight");
            System.out.println("4. Light-Middleweight");
            System.out.println("5. Flyweight");
            System.out.println("6. Light-Heavyweight");

            if(input.hasNextInt()) {
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        weightCategory = "Lightweight";
                        System.out.println("You choose \"Lightweight\"");
                        break;
                    case 2:
                        weightCategory = "Middleweight";
                        System.out.println("You choose \"Middleweight\"");
                        break;
                    case 3:
                        weightCategory = "Heavyweight";
                        System.out.println("You choose \"Heavyweight\"");
                        break;
                    case 4:
                        weightCategory = "Light-Middleweight";
                        System.out.println("You choose \"Light-Middleweight\"");
                        break;
                    case 5:
                        weightCategory = "Flyweight";
                        System.out.println("You choose \"Flyweight\"");
                        break;
                    case 6:
                        weightCategory = "Light-Heavyweight";
                        System.out.println("You choose \"Light-Heavyweight\"");
                        break;
                    default:
                        System.out.println("Invalid Input Try Again");
                        continue;
                }
                break;
            }else{
                System.out.println("Invalid Input " + "[Enter only (1,2,3,4,5,6)] ");
                input.next();
            }
        }
    }
    public void EnterCurrentWeight(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Current Weight");

        while(true){

            if(input.hasNextInt()){
                currentWeight = input.nextInt();
                System.out.println("Your current weight is: " + currentWeight + "kg");
                break;
            }else{
                System.out.println("Invalid Input Try Again");
                input.next();
            }

        }

    }
    public void ComparedWeight(){
        System.out.println("Your weight category is: " + weightCategory + " and " +  " Your current weight is: " + currentWeight);
    }
}