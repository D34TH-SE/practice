import java.util.*;

public class Weight {

    public static void forDisplay(){
        System.out.println(" ");
        System.out.println("Weight Categories ");
        System.out.println("Categories \t\t\t Upper Weight Limit (Kg) ");
        System.out.println("Heavyweight \t\t\t Unlimited (over 100) ");
        System.out.println("Light-Heavyweight \t\t\t 100 ");
        System.out.println("Middleweight \t\t\t\t 90");
        System.out.println("Light-Middleweight \t\t\t 81");
        System.out.println("Lightweight \t\t\t\t 73");
        System.out.println("Flyweight \t\t\t\t\t 66");
    }
    public static void weightDisplay(){
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a Categories:");
        String choice1 = input.nextLine();

        System.out.println(" ");
        System.out.println("1. Heavyweight");
        System.out.println("2. Light-Heavyweight");
        System.out.println("3. Middleweight");
        System.out.println("4. Light-Middleweight");
        System.out.println("5. Lightweight");
        System.out.println("6. Flyweight");



        while(true){

            switch (choice1){
                case "1":
                    System.out.println("Heavyweight");
                    break;

                case "2":
                    System.out.println("Light-Heavyweight");
                    break;

                case "3":
                    System.out.println("Middleweight");
                    break;

                case "4":
                    System.out.println("Light-Middleweight");
                    break;

                case "5":
                    System.out.println("Lightweight");
                    break;

                case "6":
                    System.out.println("Flyweight");
                    break;

                default:
                    System.out.println("INVALID INPUT");
                    System.out.println("1. Heavyweight");
                    System.out.println("2. Light-Heavyweight");
                    System.out.println("3. Middleweight");
                    System.out.println("4. Light-Middleweight");
                    System.out.println("5. Lightweight");
                    System.out.println("6. Flyweight");
                    continue;
            }
            break;
        }


    }
}
