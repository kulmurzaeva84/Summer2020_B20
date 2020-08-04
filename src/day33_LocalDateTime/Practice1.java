package day33_LocalDateTime;

import java.time.LocalDate;

public class Practice1 {

    public static void main(String[] args) {
        String[] students = {"Kalbinur Kaherman", "Jika Mika", "Daika Erika", "Mama"};
        LocalDate[] birthDays = {
                LocalDate.of(1982,12,26),
                LocalDate.of(1984,03,11),
                LocalDate.of(2007,05,05),
                LocalDate.of(1961,02,17),
        };

        for(int i =0; i<= students.length-1; i++){
            System.out.println(students[i]+" : "+ birthDays[i]);
        }
        System.out.println("============================");

        for(LocalDate each: birthDays){
            if(!each.isLeapYear()){
                continue;
            }
            System.out.println(each);
        }

    }
}
