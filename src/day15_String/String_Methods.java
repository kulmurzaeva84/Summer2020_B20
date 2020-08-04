package day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek School is a great place";
        //             01234567
        // charAT(index): counts from 0
        char ch1 = name.charAt(0); // 'C'
        char ch2 = name.charAt(5); //'t'
        System.out.println(ch1);
        System.out.println(ch2);

        //length() ==> int -> counts from 1
        int l = name.length();
        System.out.println(l); // returns 15

        //last index: lengthof String -1
        int lastIndexNumber = name.length()-1;
        System.out.println(lastIndexNumber); //14

        char lastChar= name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        // concat(Str):concatenation with any other data types
        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School");// Cybertek School
        System.out.println(schoolName);

        String r1 = "Cybertek"+123+'A'+true;// Cybertek123Atrue
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");




    }
}
