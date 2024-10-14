package northsussexjudo;
import java.util.*;

public class CheckedTheDay {
    private int day;
    private String month = "October";
    private final int year = 2024;

    public CheckedTheDay(int day){
        this.day = day;
    }
    private boolean correctSecondSaturday(int day){
        return day == 13;
    }
    private boolean validDay(int day){
        return day >= 1 && day <= 31;
    }
    public boolean isItPastSecondSaturday(){
        int secondSaturday = 12;
        return day >= secondSaturday;
    }
    public void displayOfDate(){
        System.out.println("Date: " + month + " " + day + " " + year);
    }
    public void InputTheCurrentDay(){
        Scanner sc2 = new Scanner(System.in);
        boolean InputIsValid = false;

        while(!InputIsValid){
            System.out.println("Enter the current day: ");

            if(sc2.hasNextInt()) {
                day = sc2.nextInt();
                if (validDay(day)) {
                    if(day == 12) {
                        System.out.println("It is Second Saturday");
                        InputIsValid = true;
                    }else if(day > 12){
                        System.out.println("It is past the Second Saturday");
                        InputIsValid = true;
                    }else{
                        System.out.println("It is not yet past Second Saturday");
                        InputIsValid = true;
                    }
                } else {
                    System.out.println("Invalid Input Try Again: [Enter only 1 to 31]");
                }
            }else{
                System.out.println("Invalid Input Enter only numbers" );
                sc2.next();
            }
        }

    }
    public int getDay(){
        return day;
    }

}