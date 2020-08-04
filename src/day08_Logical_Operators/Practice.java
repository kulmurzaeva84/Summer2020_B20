package day08_Logical_Operators;

public class Practice {
    public static void main(String[] args) {
        // && logic: AND logic &&= AND
        // if at least one of statements is false it returns false
        // it only returns true if both of statements are true
        String firstName = "Jika";
        String lastName = "Kulmurzaeva";
        String fullName = firstName+" "+ lastName;
        int age  = 36;
        String citizenShip = "USA";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
                              //  19>= 18  && "China" == "USA"; ==> false cuz for && it should be both true
        System.out.println(eligibleToVote);
        System.out.println(fullName+ " is eligible to vote: "+ eligibleToVote);

         boolean r6 = !true && false ; // false , if one of conditions is false it alsways returns false
        boolean r7 =  !false && 9>8 ;  // true

        System.out.println("================================================");
         //   || - OR logic || == OR
          // OR logic always returns true if either of statements is true
         boolean r8 = true == !false || false == true;
        System.out.println(r8);

        boolean r9  = !false == false || true == !false;
        System.out.println(r9);

        boolean r10 = !false == false && true == !false;
        System.out.println(r10);
    }





}
