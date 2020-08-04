package day08_Logical_Operators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Practice2 {
    public static void main(String[] args) {
        String fullName = "Conor McGregor";
        int age = 12;
        String citizen1 = "USA";
        String citizen2 = "France";

        boolean eligibleAge = age >= 18;
        // 12>= 18 ==> false
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
        // "USA ==  "USA" || "France" == "USA"
        // true           ||  false  ==> true
        boolean eligibleToVote = eligibleAge && usCitizen;
        // false     &&  true   ==> false
        System.out.println(eligibleToVote);
        System.out.println(fullName+ " is eligible to vote for Trump: "+ eligibleToVote);

    }







}
