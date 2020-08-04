package day15_String;

public class substring_method {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789..
        // substring(beg index and end index)
        // ! remember ending index is always excluded
        String word1 = sentence.substring(0, 4);
        System.out.println(word1);

        String word2 = sentence.substring(8,11);
        System.out.println(word2);

        System.out.println("====================");

        String sentence2 = "I like Movies and TV Series";
        String word3 = sentence2.substring(7, 13);
        System.out.println(word3);

        System.out.println("====================");
        String firstName = "MUHTAR";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1, firstName.length()); //=> last index +1

        firstName = firstCharacter.toUpperCase()+rest.toLowerCase();

        System.out.println(firstCharacter);
        System.out.println(rest);
        System.out.println(firstName);

        System.out.println("=====================");

        // ! substring(beg):
        // "Muhtar".substring(1); ==> uhtar
        String lastName = "school";
        String firstChar = lastName.substring(0,1); //s
        String reamining = lastName.substring(1); // chool
        lastName = firstChar.toUpperCase()+reamining.toLowerCase();

        //System.out.println(firstChar);
        //System.out.println(reamining);
        System.out.println(lastName);
        System.out.println("=============================");

        String s = "I like Game of Thrones";
        //          0123456789...
        String series = s.substring(7);
        System.out.println(series); // ==> Game of Thrones

        String s2 = "I like Java Programming Language";
        String language = s2.substring(7);
        System.out.println(language);


    }
}
