package day04_Variables;

public class Concate_Add {
    // addition: number + number in other cases it will appended
    public static void main(String[] args) {
        System.out.println(12+13);  //25
        System.out.println('A'+2);  //67
        System.out.println('A'+'B');  // 65+66 =131

        // Concationation: append
        System.out.println("12"+13); //1213
        System.out.println("A"+2);  //A2
        System.out.println("Gender: "+ 'M'); //Gender: M
        System.out.println("Tax:"+3.5+ "%");  // Tax: 3.5%
        //OR
        System.out.println("Tax:"+3.5+ '%');  //// Tax: 3.5%

        System.out.println(3.5 +'%'+"Tax");  //3.5+37+"Tax"= 40.5 Tax

    }


}
