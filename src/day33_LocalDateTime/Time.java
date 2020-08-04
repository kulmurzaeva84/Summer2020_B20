package day33_LocalDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(15,45,55);
        System.out.println(t1);

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.of(2020,07,25,10,15);
        System.out.println(t3);

        LocalDateTime t4 = LocalDateTime.now();
        System.out.println(t4);

        // DateTimeFormatter : should provide yy, yyyy for year
        // MM(number), MMM(letters ,like Jan), MMMM(entire month name , like January)
        // Dates: dd








    }
}
