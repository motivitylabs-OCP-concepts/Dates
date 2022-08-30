package ConversionOfDateToString;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//  program to convert Date to String
public class Example {
    // Function to convert date to string
    public static String
    convertDateToString(String date)
    {
        // Converts the string
        // format to date object
        DateFormat df = new SimpleDateFormat(date);

        // Get the date using calendar object
        Date today = Calendar.getInstance()
                .getTime();

        // Convert the date into a
        // string using format() method
        String dateToString = df.format(today);

        // Return the result
        return (dateToString);
    }
    public static void main(String[] args) {
        // Given Date
        String date = "07-27-2020";

        // Convert and print the result
        System.out.print(
                convertDateToString(date));
    }
}
