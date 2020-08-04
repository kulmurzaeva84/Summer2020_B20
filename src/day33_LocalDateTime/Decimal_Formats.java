package day33_LocalDateTime;

import java.text.DecimalFormat;

public class Decimal_Formats {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00"); //=> returns String
        // you can add parameter as 0.0, 0.00, 0.000
        // df can be any name

        double a = 22/7.0; // at least one of them should be decimal

        System.out.println(a); // 3.142857.....
        System.out.println(df.format(a)); // 3.14

        //6.666666789097
        System.out.println(df.format(6.666666789097)); // => 6.67







    }
}
