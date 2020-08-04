package day09_If_Statement;

public class Minimum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIsMin = a <b && a<c;
        boolean bIsMin = aIsMin == false && b<c; // can also use !aIsMin for first part
        //              b<a && b<c;
        boolean cIsMin = !aIsMin && !bIsMin;
        //              aIsMin == false && bIsMin == false;
        double min = 0;

        if(aIsMin){
            min = a;
        }
        if(bIsMin){
            min = b;
        }
        if(cIsMin){
            min = c;
        }
        System.out.println(min+" is a minimnum number");


    }
}
