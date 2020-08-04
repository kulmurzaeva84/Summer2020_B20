package day34_WrapperClasses;

import java.util.ArrayList;

public class ArrayList_Practice2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(80);
        list.add(120);
        list.add(70);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer each: list){
            if(each> max){
                max = each;
            }
            if(each<min){
                min = each;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
