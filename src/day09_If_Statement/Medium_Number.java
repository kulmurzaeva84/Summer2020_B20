package day09_If_Statement;
// find out which is a medium number
public class Medium_Number {
    public static void main(String[] args) {
        double a =100;
        double b = 200;
        double c = 300;

        boolean aIsMed = (a >b && a<c) || (a>c && a <b);
        boolean bIsMed = (b>c && b<a) || (b<c && b>a);
        boolean cIsMed = !aIsMed && !bIsMed;

        double med =0;

        if(aIsMed){
            med = a;
        }
        if(bIsMed){
            med = b;
        }
        if(cIsMed){
            med = c;
        }
        System.out.println(med+" is a medium number");

    }
}
