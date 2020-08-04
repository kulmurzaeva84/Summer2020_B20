package day06_Comparison_Operators;

public class RelationalOperators {
   /*  relational operators: returns boolean at the end
   >: greater than
   <:  less than
   >=:  greater or equal
   <=: less than or equal
   ==: equal
   !=: not equal

   10 ==10 => true
   true == false ==> false
   'A' = 'A' => true
   "Muhtar" =="Good Guy"  => false
   9 !=10 true
    */

    public static void main(String[] args) {
      boolean r1= 10>9;
        System.out.println(r1);  // true
        boolean r2 = 100< 9000;
        System.out.println(r2); // true

        // >=
        boolean r3 = 87 >= 85; // true
        System.out.println(r3);

        boolean r4 = 877 >= 878;  // false
        System.out.println(r4);

        // <=
        boolean r5 = 200 <= 300;  //true
        System.out.println(r5);

        // ==: equal
        boolean r6 = 900 == 800;  // false
        System.out.println(r6);

        boolean r7 = true== false;  // false
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Muhtar";  // true
        System.out.println(r8);
        boolean r9 = "Jika" == "A good girl"; // false
        System.out.println(r9);
        boolean r10 = "Muhtar" == "MUHTAR";  //false cuz java is case sensitive

        // !=
        boolean r11 = "Muhtar" != "Bad Guy";  // true
        System.out.println(r11);

        boolean r12 = true != false;  // true

        boolean result1 = 'A' == 65; // true
        boolean result2 = 100 == 100.0;// true  cuz value is the same
        System.out.println(result2);
        boolean reslut3 = 10 == 10.99999999; // false but 10 == (int)10.99999999 - true

        int number = 101;
        boolean even = number%2 ==0;
        System.out.println(even);
        boolean odd = number%2 != 0;
        System.out.println(odd);

        int x= 1000;
        // odd:   x % 2 != 0
        // even: x % 2 == 0
        // divisible by 3: x % 3 ==0
        // divisible by 5: x % 5 ==0






    }



}
