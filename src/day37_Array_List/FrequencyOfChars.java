package day37_Array_List;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "AAABBC";

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

   /*     for(String each : str.split("")){
            list.add(each);
        }

    */
        System.out.println(list);

        String nonDup = Util.removeDup(str);  // "ABC"

        for(String each: nonDup.split("")) {  // each : A, B, C by applying split method we turned String to Collection type

        int count =  Collections.frequency(list, each);
        System.out.println(each +count);

        }

    }
}
