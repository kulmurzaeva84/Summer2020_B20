package Office_Hours.Practice_06_17_2020;

public class Logical_Operators {
    public static void main(String[] args) {
        boolean r1 = !true != true; // != -is not equal
        //           false != true
        System.out.println(r1);
        boolean r2 = !r1;
        System.out.println(r2);

        System.out.println(!!!!!false); // odd number of !s  => true
        System.out.println(!!!!!!false);// even # of !s => false
        System.out.println("============================");

        // ||:
        boolean result1 = 9>10 || "java"=="java" || 'A' == 'a';
        //               false || true || false
        System.out.println(result1);

        // &&: both conditions should be true
        boolean result2 = "Java" != "Python" && "Muhtar"== "Good guy";
        System.out.println(result2);





    }
}
