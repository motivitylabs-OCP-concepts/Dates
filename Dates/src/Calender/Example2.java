package Calender;

import java.util.Calendar;
// To fetch Hour, Minute, Second and AM_PM
public class Example2 {
    public static void main(String[] args) {
        // creating a calendar
        Calendar c = Calendar.getInstance();

        // get the value of HOUR field
        System.out.println("Hour : " + c.get(Calendar.HOUR));

        // get the value of MINUTE field
        System.out.println("Minute : " + c.get(Calendar.MINUTE));

        // get the value of SECOND field
        System.out.println("Second : " + c.get(Calendar.SECOND));

        // get the value of AM_PM field
        System.out.println("AM or PM : " + c.get(Calendar.AM_PM));

        // get the value of HOUR_OF_DAY field
        System.out.println("Hour (24-hour clock) : " + c.get(Calendar.HOUR_OF_DAY));
    }
}
