package DateMethods;

import java.util.Date;
//  program explaining Date class methods
// after(), clone(), before()
public class Example3 {
    public static void main(String[] args) {
        // create 2 dates
        Date date1 = new Date(2016, 11, 18);
        Date date2 = new Date(1997, 10, 27);

        // Use of after() to check date2 is after date1
        boolean a = date2.after(date1);
        System.out.println("Is date2 is after date1 : " + a);

        // Use of after() to check date2 is after date1
        a = date1.after(date2);
        System.out.println("Is date1 is after date2 : " + a);
        System.out.println("");

        // Use of clone() method
        Object date3 = date1.clone();
        System.out.println("Cloned date3 :" + date3.toString());
        System.out.println("");

        // Use of before() to check date2 is after date1
        boolean b = date2.before(date1);
        System.out.println("Is date2 is before date1 : " + a);
    }
}
