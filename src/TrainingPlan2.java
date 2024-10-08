import java.util.*;

public class TrainingPlan2 {

    public static void display2(){
        System.out.println(" ");
        System.out.println("1. Beginner");
        System.out.println("2. Intermediate");
        System.out.println("3. Elite");

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Training Plan ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Beginner");
                    break;

                case "2":
                    System.out.print("Intermediate");
                    break;

                case "3":
                    System.out.print("Elite");
                    break;

                default:
                    System.out.println("INVALID TRY AGAIN ");
                    System.out.println("1. Beginner");
                    System.out.println("2. Intermediate");
                    System.out.println("3. Elite");
                    continue;
            }
            break;
        }
    }
}

