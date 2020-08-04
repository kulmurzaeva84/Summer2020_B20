package day32_Method_Overloading;
import Library.Util;
import java.util.Arrays;
public class Method_Calls {
    public static void main(String[] args) {

        String firstName= "daShkA";
        String lasName = "kaKaShKa";

        String fullName;

        fullName= Util.formatFullName(firstName,lasName);
        System.out.println(fullName);

        String uniques = Util.uniques(fullName);
        System.out.println(uniques);

        String reversedName= Util.reverse(fullName);
        System.out.println(reversedName);

        System.out.println("========================");

        int[] a= {200, 400, 500, 200, 1000, 50, 40, 30, 400, 60, 78};
        int n = 2500;
        a = Util.addElement(a, n);

        System.out.println( Arrays.toString(a) );

    }
}
