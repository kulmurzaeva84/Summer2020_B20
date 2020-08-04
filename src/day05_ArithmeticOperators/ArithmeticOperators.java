package day05_ArithmeticOperators;

import java.sql.SQLOutput;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(20 + 3-2+1 ); //22
        System.out.println(20*3);
        System.out.println(2+3-1*4); //1
        System.out.println(10/3);  // since both numbers are integers it gives integer
        // int/int=int 10/3=3
        System.out.println(10.0/3);  // double/int =double  OR int/dounble=double
        // if one of numerator or denominator is decimal it returns double  3.3333
        System.out.println(10/3.0);  // it gives 3.3333
        System.out.println(10.0/3.0);  //double/double=double
        // 30/8 =3
        // remainder: 30-(8*3) =6
        System.out.println(99%4);  // 99/4=24  99-(4*24)= 3 it's a remainder
        // remainder operator is a module, */+- are precedures might be higher and lower
        // *./,% - higher procedure and +,- are lower procedure




    }



}
