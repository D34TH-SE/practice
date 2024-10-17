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
            nameIsValid = validationName(athleteName);

            if(!nameIsValid){
                System.out.println("Invalid Input Try Again");
            }
        }while(!nameIsValid);
        System.out.println("Proceeding.......");
    }
    private boolean validationName(String input){
        boolean hasNumbers = false;
        boolean hasSymbols = false;

        for (char ch : input.toCharArray()) {

            if (Character.isDigit(ch)) {
                hasNumbers = true;
            }
            else if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                hasSymbols = true;
            }
        }
        return !hasNumbers && !hasSymbols;
    }

    public void inputWeightCategory(){
        Scanner input = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("Select your weight category: ");
            System.out.println("1. Heavyweight");
            System.out.println("2. Light-Heavyweight");
            System.out.println("3. Middleweight");
            System.out.println("4. Light-Middleweight");
            System.out.println("5. Lightweight");
            System.out.println("6. Flyweight");

            if(input.hasNextInt()) {
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        weightCategory = "Heavyweight [Above 100kg]";
                        System.out.println("You choose \"Heavyweight\"");
                        break;
                    case 2:
                        weightCategory = "Light-Heavyweight [100kg]";
                        System.out.println("You choose \"Light-Heavyweight\"");
                        break;
                    case 3:
                        weightCategory = "Middleweight [90kg]";
                        System.out.println("You choose \"Middleweight\"");
                        break;
                    case 4:
                        weightCategory = "Light-Middleweight [81kg]";
                        System.out.println("You choose \"Light-Middleweight\"");
                        break;
                    case 5:
                        weightCategory = "Lightweight [73kg]";
                        System.out.println("You choose \"Lightweight\"");
                        break;
                    case 6:
                        weightCategory = "Flyweight [66kg]";
                        System.out.println("You choose \"Flyweight\"");
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

                    if(currentWeight >=0) {
                        System.out.println("Your current weight is: " + currentWeight + "kg");
                        break;
                    }else{
                        System.out.println("Invalid Input Don't Enter Negative Number");
                    }
            }else{
                System.out.println("Invalid Input Try Again");
                input.next();
            }

        }

    }
    public void ComparedWeight(){
        System.out.println("Comparing Your weight category [" + weightCategory + "] vs " +  " Your current weight [" + currentWeight +"kg]");
    }
    public String getAthleteName(){
        return athleteName;
    }
}