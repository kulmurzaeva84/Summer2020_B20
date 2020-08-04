package day19_ForLoop;

public class PalindromeTest {
    public static void main(String[] args) {

        String str = "mom ";// civic,madam, lol,level  // Cybertek

        String reversedStr = "";
        for(int i = str.length()-1; i>=0; i--){
            reversedStr += str.charAt(i);
        }
        System.out.println(reversedStr);
        System.out.println(str.equals(reversedStr));// true or false
    }
}
