package day03_Sequences_Variables;

import java.sql.SQLOutput;

public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Hello Everyone \nMy name is Jika");
        System.out.println("\tI'm in Austin, Texas\n");
        System.out.println("\n\n\t\t\tI love programming");

        System.out.println("\\");  // just need to double it.
        // in order to get one backslash you have to enter 2 of them. This prints me one back  slash
        System.out.println("/");
        // for front slash no need to add anything just a front slash
        System.out.println("\\\\");  // will print you two back splashes, since it is doubled
        // appends paragraph tab- \t like "Tab" command
        System.out.println("My name is \'Jika\'"); // for single quote: \' prints 'Jika'
        System.out.println("My name is 'Jika'");  // prints 'Jika'
        System.out.println("My favorite TV-series: \"Game of Thrones\"");
        // for double quotes need only use escape sequences: \"





    }




}
