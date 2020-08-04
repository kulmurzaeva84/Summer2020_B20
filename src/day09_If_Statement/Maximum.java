package day09_If_Statement;
/*
Write a java program that accepts three numbers and return the maximum number
(assume that none of them are equal)
 */
public class Maximum {
    public static void main(String[] args) {
        double a = 500;
        double b = 200;
        double c = 1000;

        boolean aIsMax = a>b && a>c;
        //           500> 200 && 500> 1000
        //             true  && false ==> false
        boolean bIsMax = b>a  && b>c;
                // Another way : aIsMax == false  && b>c;
        boolean cIsMax = c>a && c>b;
                // aIsMzx == false && bIsMax == false;
        // boolean cIsMax = !aIsMax && !bIsMax ==> !(aIsMax && bIsMax)
        double max = 0; // we want to assign the maximum number to variable max
        // and max might be any number not only 0
        if(aIsMax){
            // System.out.println(a); this is onw way without max variable
            max = a;
        }
        if(bIsMax){
           //  System.out.println(b);
            max = b;
        }
         if(cIsMax){
             // System.out.println(c);
             max = c;
         }
        System.out.println(max+ " is a maximum number");

    }
}
