package day10_IfStatements;

public class Character_Identify {
    public static void main(String[] args) {

        char character = 'A';    //@
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        //                this condition is for upper case letters  || lower case letter
        //              in math it's 65<= character <=90 || 97<= character <= 122
        boolean isDigit = (character >= 48 && character <= 57);

        boolean isSpecialChar = !isAlphabetic && !isDigit;
        //

        String alphabet = "";

        if (isAlphabetic == true) {
            //  System.out.println(character+" is Alphabetic character");
            alphabet = character + " is Alphabetic character";
        } else {
            //if(!isAlphabetic == false) {
            // System.out.println(character+" is not Alphabetic character");
            alphabet = character + " is not Alphabetic character";
        }
        System.out.println(alphabet);
         /*
        System.out.println(isAlphabetic);
        System.out.println(character+" is Alphabetic character");
        System.out.println(character+" is not Alphabetic character");
         */
        String digit = "";
        if (isDigit) {
            digit = character + " is a digit";
        } else {
            digit = character + " is not a digit";
        }
        System.out.println(digit);
    }

    String specialCharacter = "";

    //  if(isSpecialChar == true){
    // specialCharacter = character+"is a special character"; 
     // }

    }

