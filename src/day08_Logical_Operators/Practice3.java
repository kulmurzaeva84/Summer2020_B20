package day08_Logical_Operators;

public class Practice3 {
    public static void main(String[] args) {
        int b =2;
        boolean res = ++b ==2 || --b == 2 && --b == 2;
        //              3 ==2  || 2 == 2   && 1 = 2
        //             false  || true   && false
        //                   true      &&   false
        //                          false
        System.out.println(res);
        System.out.println(b);

        int c = 5;  //5
        boolean r2 = c ++ ==6 || c-- == 5 || c == 5;
        //           5 ==6   || 6 ==5        5 == 5
        //            false   || false   || true
        System.out.println(r2);

        boolean x = true , z = true ;
                int y = 20;
        x = (y!= 10) || (z==false);
        System.out.println(x);

        boolean A = true;
        boolean B = !A; // B= false

        boolean C = A != B && A == !B  && !A == B;
        //        true != false && true == true  && false == false
        //        true     && true  &&  true
        System.out.println(C);





    }


}
