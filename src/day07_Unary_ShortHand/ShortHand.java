package day07_Unary_ShortHand;

public class ShortHand {
    public static void main(String[] args) {

        int a =100;
        // a=a*a; // for a in square
        a*=a;
        System.out.println(a); // 10000

        int b=2;
        b*=3;
        System.out.println(b);  //6

        int c = 300;
        c-= 100;
        System.out.println(c); //200

        System.out.println("===================================");

       //  +=:
        int z = 300;
        z += 200;  // z=z+200
        System.out.println(z);

        String firstName = "Jika";
        String lastName = "Kulmrzaeva";
            firstName = firstName+ " is my name" ;
        firstName += " is my name";
        System.out.println(firstName);

        String fullName = "Donald";
        fullName += " Trump";
        System.out.println(fullName);

        String helloWorld = "Hello";
        helloWorld+= " World";
        System.out.println(helloWorld);

        String fullNamE = "Mickey";
        fullNamE += "Mouse";
        System.out.println("=============================");

        // /=: division assignment






    }

}
