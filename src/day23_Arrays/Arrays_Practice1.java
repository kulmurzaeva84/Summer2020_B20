package day23_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {
        // String students = "Jika", "Mika";

        String[] students = {"Cybertek", "Muhtar", "Nadir", "Jika"}; // Size 5  // you can place [] after variable Name
        //                    0             1         2        3   index numbers of datas
               String name1 =  students[3];
        System.out.println(name1);

        String[] names= {"Mike", "Adam", "Tonny", "John", "Ammy" }; // size 5
        //                  0       1       2        3       4
        int[] scores = {85, 70, 95, 90, 100};
        //               0   1   2   3    4
        /* we can replace repeated actions by loop
        System.out.println( names [0] +" :"+ scores[0]);
        System.out.println( names [1] +" :"+ scores[1]);
        System.out.println( names [2] +" :"+ scores[2]);
        System.out.println( names [3] +" :"+ scores[3]);
        System.out.println( names [4] +" :"+ scores[4]);
        */
        for(int i= 0; i<=4 ; i++){  // i: 0 1 2 3 4
            System.out.println(names[i] + " :" + scores[i]);
        }
        System.out.println("============================");

        String[] classMates = new String[5];  // specified the size of an array
        classMates[0]= "Fatih";
        classMates[2]= "Hazel";
        classMates[1]= "Viorel";
        classMates[3]= "Elkem";
        classMates[4]= "Ahmed";
        for(int i = 0; i<= classMates.length-1; i++){
            System.out.println(classMates[i]);
        }














    }
}
