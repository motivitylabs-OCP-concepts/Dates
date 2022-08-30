package Calender;

import java.util.Calendar;
//To fetch Date, Month, Year
public class Calender {
    public static void main(String[] args) {
        // creating a calendar
        Calendar c = Calendar.getInstance();

        // get the value of DATE field
        System.out.println("Day : " +
                c.get(Calendar.DATE));

        // get the value of MONTH field
        System.out.println("Month : " +
                c.get(Calendar.MONTH));

        // get the value of YEAR field
        System.out.println("Year : " +
                c.get(Calendar.YEAR));
    }
}
