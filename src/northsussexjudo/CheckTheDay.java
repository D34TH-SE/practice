
package northsussexjudo;
import java.util.*;

public class CheckTheDay {
    private int day; //Holds the current day input by the user
    private String month = "October"; //Hardcoded the month
    private final int year = 2024; //Hardcoded the year

    //Initializes the day variable
    public CheckTheDay(int day) {
        this.day = day;
    }
    private boolean correctSecondSaturday(int day) {
        return day == 13;
    }
    //Private method to verify if the inputted day is within the valid range
    private boolean validDay(int day) {
        return day >= 1 && day <= 31;
    }
    //Check if the current day is before or on the second Saturday (day 12)
    public boolean isItPastSecondSaturday() {
        int secondSaturday = 12; //The day for the second saturday of the month
        return day <= secondSaturday; //Return true if the day is on or before the Second Saturday
    }
    //Displays the formatted date including the month, day and year
    public void displayOfDate() {
        System.out.println("Date: " + month + " " + day + " " + year);
    }
    //Prompting the user to input the current day, ensuring the input is valid
    public void inputTheCurrentDay(){
        Scanner sc2 = new Scanner(System.in);
        boolean InputIsValid = false;

        //Loops continue until a valid day is entered
        while(!InputIsValid) {
            System.out.println("Enter the current day: ");

            //Checks if the input is a number
            if(sc2.hasNextInt()) {
                day = sc2.nextInt(); //Reads the inputted day

                //Validates if the day is within the range (1-31)
                if (validDay(day)) {
                    //Checks it the day is exactly the 12th, indicating it is the 2nd Saturday
                    if(day == 12) {
                        System.out.println("It is Second Saturday");
                        InputIsValid = true; //Ends the loop

                    }else if(day > 12) { //Checks if the day is past 12, It is after the 2nd Saturday
                        System.out.println("It is past the Second Saturday");
                        InputIsValid = true;

                    }else { //Checks if the day is not yet past the second saturday it can enter the competition
                        System.out.println("It is not yet past Second Saturday");
                        System.out.println("Proceed to Register the Competition....");
                        InputIsValid = true;
                    }
                } else {
                    //if the user input the day out of range (1-31), prompt the user again
                    System.out.println("Invalid Input Try Again: [Enter only 1 to 31]");
                }
            }else {
                //If the user input a non-integer or not number prompt the user to enter the numbers only
                System.out.println("Invalid Input Enter only numbers" );
                sc2.next(); //Clears the invalid input
            }
        }

    }
    //Getter method to return the day
    public int getDay() {
        return day;
    }

}
