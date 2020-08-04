package day36_Array_List;

import java.util.ArrayList;
import java.util.Collections;
/*
{30 20 40 50 15}
output: 50 40 30 20 15
 */
public class Collections_Practice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(15);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> descendingList = new ArrayList<>();

        for(int i=list.size()-1; i>= 0; i-- ){
           // System.out.print(list.get(i)+" ");
            descendingList.add(list.get(i));
        }
        System.out.println(descendingList);

    }
}
