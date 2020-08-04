package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays3 {
    public static void main(String[] args) {

        String[] a1 = {"Papa", "Mama","Nyky"};
        String[] a2 = {"Mika", "Jika","Daianok", "Erika"};

        String[] family = new String[a1.length+ a2.length];

        for(int i=0; i<= a1.length-1; i++){
            family[i]= a1[i];
        }
        for(int i=0; i<= a2.length-1; i++){
            family[a1.length+ i]= a2[i];
        }
        System.out.println(Arrays.toString(family));
    }
}
