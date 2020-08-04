package day34_WrapperClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// use LocalDate and Time to get the cuurent date and time in the following format:
// Sunday, 09:51 AM, Jul/26/2020
public class warmUp {
    public static void main(String[] args) {
// Do not forget to import DateTimeForamtter and LocalDateTime from java!!!

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh: mm a, MMM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now(); // call now() and assign it to a variable

        System.out.println(today); // 2020-07-26T09:32:50.953

        System.out.println(today.format(dtf));  // Sunday, 09: 32 AM, Jul/26/2020





    }
}
