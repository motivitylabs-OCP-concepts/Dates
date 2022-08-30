package ConversionOfDateToString;

import java.time.LocalDate;

public class Example1 {
    // Function to convert date to string
    public static String
    convertDateToString(String date)
    {

        // Get an instance of LocalTime
        // from date
        LocalDate givenDate = LocalDate.parse(date);

        // Convert the given date into a
        // string using toString()method
        String dateToString
                = givenDate.toString();

        // Return the result
        return (dateToString);
    }

    // Driver Code
    public static void main(String args[])
    {

        // Given Date
        String date = "2020-07-27";

        // Convert and print the result
        System.out.print(
                convertDateToString(date));
    }
}
