package day35_ArrayList;

public class SumOfDigits2 {
    public static void main(String[] args) {

        String str = "a1b2c3d4e5f6";
        int sum = 0; //1+2+3 == 6
        // 49+50+51 == 150
        for(char each: str.toCharArray()){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(each+"");
            }
        }
        System.out.println(sum);
    }
}
    /*
Character:
    isDigit(char): verifies if the char is digit, returns boolean
    isLetter(char): verifies if the char is letter, returns boolean
     */
