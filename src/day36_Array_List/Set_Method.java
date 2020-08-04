package day36_Array_List;

import java.util.ArrayList;

/*
1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
 */
public class Set_Method {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        // set(current index, new value that will replace )
        list1.add(10);  //0
        list1.add(10);  //1
        list1.add(10);  //2
        list1.add(10);  //3
        list1.add(10);  //4

        // list1.set(4,0); //==> index 4 will be 0 and it works only if there are 5 elements
        list1.set(list1.size()-1,0); // this way the last element will always be 0
        System.out.println(list1);
        System.out.println("==============================");

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=1; i<=20; i++){
            list2.add(i);
        }
        System.out.println(list2);

        for(int i=0; i<=list2.size()-1; i++){  //i : index numbers
            int each =list2.get(i); //  each element in the list
            if(each %2 !=0){
                list2.set(i, each*2);
            }else{
                list2.set(i, each*3);
            }
        }
        System.out.println(list2);


    }

}
