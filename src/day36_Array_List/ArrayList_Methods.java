package day36_Array_List;


import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(40);

        int a = list.indexOf(40);
        System.out.println(a);   //3
        System.out.println(list.indexOf(60)); // 60 does not exist in the list and returns -1
        System.out.println(list.lastIndexOf(40));  // 5

         boolean r1 = list.contains(100);
        System.out.println(r1);
        System.out.println("========================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("cybertek");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.equals(list2)); // ==> true or false

        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println(list3.isEmpty()); // ==> true





    }
}
