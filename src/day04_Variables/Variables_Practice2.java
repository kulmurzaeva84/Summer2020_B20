package day04_Variables;

public class Variables_Practice2 {
    public static void main(Variables_Practice3[] args) {
        int iNum = 50;
        long bNum = iNum;
        // int iNum2 = lNum; can't be asigned since int is smaller primitive than long
        //float fNum = lNum;  // 50.0
        //float fNum =500; can't be used since variableNmae should be unique and we already have it
        // flaot 123fNum = 500  can't start with numbers but anywhere else is fine
        float fNum_=500;
        float f_num$ = 1000;
        float fNum123 = 10000;

        // 1,000,000 can't use ',' in Java, you can use '_'
        int num1 = 1_000_000;
        System.out.println(num1);

        int num2;
        num2 = 2000;
        num2 = 5000; // always prints the latest from top to bottom
        System.out.println(num2);





    }
}
