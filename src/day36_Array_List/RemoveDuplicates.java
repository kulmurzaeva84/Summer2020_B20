package day36_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A','A', 'B', 'B', 'C', 'C'));

        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>();
        // now it's empty and we add elements after this loop and gives us ABC

        for(Character each :list){

            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
    }
}
