package day11_NestedIf_Ternary;
// ? is if; : else
public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        String result2 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result);
        System.out.println(result2);

        System.out.println("=======================================");

        int a = 10;
        int b = 20;

        String r = (a>b) ? "a is greater" : (b>a )? "b is greater" : "a is equal to b";
        System.out.println(r);




    }
}
