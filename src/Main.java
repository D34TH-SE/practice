import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("WELCOME TO NORTH SUSSEX JUDO ");
        Fee.displayFee();
        TrainingPlan.display1();

        AthleteName myAthleteName = new AthleteName();
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("ENTER YOUR NAME: ");
        String yourName = input.nextLine();
        myAthleteName.setName(yourName);

        TrainingPlan2.display2();
        System.out.println(" ");
        System.out.println(" ");
        Weight.weightDisplay();
    }
}