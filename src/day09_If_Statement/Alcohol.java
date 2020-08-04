package day09_If_Statement;
/*
write a java program that can identify if a person is eligible to buy alcohol
 */
public class Alcohol {
    public static void main(String[] args) {
        boolean hasID = true;
        int age = 19;

        boolean eligible = hasID && age >= 21;
        //                 true  && false==> false
        if(eligible == true) {
            System.out.println("Eligible to buy alcohol");
        }
        if(eligible == false){
            System.out.println("Go buy your milk");

            // Another way of doing the same

           /* boolean hasID = true;
              int age = 19;

             boolean eligible = hasID && age >= 21;
             String reslut = "";

            if(eligible == true){
                result= "Eligible to buy alcohol";
            }
            if(eligible == false) {
                result = "You are not old enough to buy alcohol";
            }
                System.out.println(resut);
            */

        }
    }


}
