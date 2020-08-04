package day37_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,30,20,56,78,98,100,20,0,-1,-3,400,500,5000));

        //max number:
        Integer max = Collections.max(list);

        // min number:
        Integer min = Collections.min(list);

        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);

        System.out.println("=================================================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll( Arrays.asList("Ramazan", "Islem", "Muhtar", "Saim", "Muhtar", "Asiya") );

        //replaceAll
        Collections.replaceAll(names, "Muhtar", "Fatime");

        System.out.println(names);
    }
}
