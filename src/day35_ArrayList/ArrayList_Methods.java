package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Jika");
        earlyBirdList.add("Zhyldyz");
        earlyBirdList.add("Jyldyz");

        earlyBirdList.add(0,"Mika"); // Mika is added to the existing list
        earlyBirdList.set(1,"Erika");  // Erika replaced Ibrahim, Ibrahim is gone now
        earlyBirdList.clear(); // it cleared the list and returned []

        System.out.println(earlyBirdList);
        System.out.println(earlyBirdList.size());  // size now is 0
        System.out.println("====================================");


        // remove(int index)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //0
        list.add(2); //1
        list.add(3); //2
        list.add(4); //3
        list.add(5); //4
       //                                                          0 1 2 3 - indexes
        list.remove(2); // it removes index 2!  and returns [1 2 4 5] ;  3 is gone
        System.out.println("===========================");


        //  remove(Element)
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1); //0
        list.add(2); //1
        list.add(3); //2
        list.add(4); //3
        list.add(5); //4

        Integer a= 1; // int a =1; it's different
        list2.remove(a); // removes first matching element, not by the index
        // it returns [2,3,4,5]
        // if you remove primitive int =a , then it removes 2 with index number 1 and returns [1,3,4,5]
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Mika");  //0
        list3.add("Jika");  //1
        list3.add("Rika");  //2
        list3.add("Kika");  //3
        list3.add("Vika");  //4

        list3.remove(0); // removes Mika
        list3.remove("Vika"); // reoves Vika
        // boolean r1= list3.remove("vika"); returns false cuz Vika not vika
        // System.out.println(r1);

        System.out.println(list3);







    }
}
