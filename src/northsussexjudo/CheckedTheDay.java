
package northsussexjudo;
import java.util.*;

public class CheckedTheDay {
    private int day;  // Holds the current the day input by the user
    private String month = "October";  // Hardcoded month for this class
    private final int year = 2024;  // Hardcoded the year same as the year right now

    // Initialize the day variable
    public CheckedTheDay (int day){
        this.day = day;
    }
    private boolean correctSecondSaturday(int day){
        return day == 13;
    }

    // Private method to verify if the inputted day is within the valid range (1-31)
    private boolean validDay(int day){
        return day >= 1 && day <= 31;
    }

    // Checks if the current day is before or on the 2nd Saturday (12)
    public boolean isItPastSecondSaturday(){
        int secondSaturday = 12;  // This is day of the 2nd Saturday of the month
        return day <= secondSaturday;     // Returns true if the day is on or before the 2nd Saturday
    }

    // Displays of formatted date
    public void displayOfDate(){
        System.out.println("Date: " + month + " " + day + " " + year);
    }

    // Prompt the user to input the current day, ensuring the input valid
    public void InputTheCurrentDay(){
        Scanner sc2 = new Scanner(System.in);  // This is for the user input
        boolean InputIsValid = false;  // This to check if the user valid input

        // Loops continues until a valid day is entered
        while (!InputIsValid) {
            System.out.println("Enter the current day: ");

            // Check if the user input an integer
            if (sc2.hasNextInt()) {
                day = sc2.nextInt();

                // Validates if the day is within range (1-31)
                if (validDay(day)) {

                    // Checks if the day is exactly the 12th which means is the 2nd saturday of the month
                    if (day == 12) {
                        System.out.println("It is Second Saturday");
                        InputIsValid = true; // Ends the loop

                    // if the day is past 12, It means it is past the 2nd saturday
                    } else if (day > 12){
                        System.out.println("It is past the Second Saturday");
                        InputIsValid = true;

                     // If the day is before 12, You can Enter the competition
                    } else {
                        System.out.println("It is not yet past Second Saturday");
                        System.out.println("Proceed to Register the Competition....");
                        InputIsValid = true;
                    }
                } else {
                    // If the input is invalid prompt the user enter numbers only
                    System.out.println("Invalid Input Try Again: [Enter only 1 to 31]");
                }
            } else {
                System.out.println("Invalid Input Enter only numbers" );
                sc2.next();
            }
        }

    }
    // Getter method to return the current day
    public int getDay(){
        return day;
    }

}
