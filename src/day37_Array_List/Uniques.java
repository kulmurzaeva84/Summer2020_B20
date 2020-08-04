package day37_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        String str ="AABBCDDEAF";
        String uniques="";

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str));

  /*      for(String each: str.split("")){
            list.add(each);
        }

   */
        System.out.println(list);

        for(String each:list){
            int count = Collections.frequency(list,each);
            if(count ==1){
                uniques += each;
            }
        }
        System.out.println(uniques);

    }
}
