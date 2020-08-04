package Office_Hours.Practice_07_28_2020;

public class Method_Practice {

    public static void main(String[] args) {
        String name = "Muhtar";
        String reversedName = reverseStr(name);
        System.out.println(name); // Muhtar
        System.out.println(reverseStr(name)); // rathuM
        System.out.println(reversedName);  // rathuM
        // if assign to a variable then call variable

        Palindrome("level");
        Palindrome("Jika");
        System.out.println("================================");

        String[] names = {"Jika", "Mika", "Erika", "Dashka", "Mamka"};

        for(String each : names){
            System.out.println(reverseStr(each));
            Palindrome(each);


        }
    }




    public static String reverseStr(String str){
        String result = "";  // A B C

        for( int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);  // C B A
        }
        return result;
    }

    public static void Palindrome(String str){ // A B C
        String reversedStr = reverseStr(str);  // C B A
        boolean palindrome = str.equalsIgnoreCase(reversedStr);

        System.out.println(palindrome ? str+ " Is Palindrome" : str+ " Is Not Palindrome");

    }
}
