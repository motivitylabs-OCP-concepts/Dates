package Calender;

import java.util.Calendar;
//To fetch Day of the week, Day of the year, Week of the month, Week of the year.
public class Example {
    public static void main(String[] args) {
        // creating a calendar
        Calendar c = Calendar.getInstance();

        // get the value of DATE_OF_WEEK field`
        System.out.println("Day of week : " +
                c.get(Calendar.DAY_OF_WEEK));

        // get the value of DAY_OF_YEAR field
        System.out.println("Day of year : " +
                c.get(Calendar.DAY_OF_YEAR));

        // get the value of WEEK_OF_MONTH field
        System.out.println("Week in Month : " +
                c.get(Calendar.WEEK_OF_MONTH));

        // get the value of WEEK_OF_YEAR field
        System.out.println("Week in Year : " +
                c.get(Calendar.WEEK_OF_YEAR));


        // get the value of DAY_OF_WEEK_IN_MONTH field
        System.out.println("Day of Week in Month : " +
                c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}
