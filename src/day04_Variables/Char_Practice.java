package day04_Variables;

public class Char_Practice {
    public static void main(Variables_Practice3[] args) {
      char ch1 = 'A';
      char ch2 = 65;  // you can declare 65 since A represents 65 in ASCII table
        System.out.println(ch1);  //it will print A since char is for single character not number
        System.out.println(ch2);

        char ch3 = 35000;
        System.out.println(ch3);

        char ch5 = 45876;    // you can assign numbers or single char to char datatype
        System.out.println(ch5);

        char c1 = 'A'; //65 in ASCII table
        char c2 = 'B'; //66
        System.out.println((c1 +c2));

        int result = c1 + c2;
        System.out.println(result);

        double d = c1 + c2;
        System.out.println(d);

        int num1 = 'A';  // will print the number since int is for numbers only
        System.out.println(num1);

        char c4 = 65+45;
        System.out.println(c4);

        char c5 = 'Z';
        char c6= 897;
        System.out.println(c6);

        char c7 = '1'; // 49 in ASCII table
        System.out.println(c7 +1 ); // will print 50 = '1' + 1
        //BUT
        char c8= '1';
        System.out.println(c8); // will print '1' cuz it's a character

        int r1 = c7;
        System.out.println(r1); // int: 49

        System.out.println("==============================");

        char a1 = 'A';




    }


}
