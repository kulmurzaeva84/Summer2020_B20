package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    public static void main(String[] args) {

         // sort
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','O', 'P','D','A','C','B'));

        System.out.println(chars); // [R, S, O, P, D, A, C, B]

        Collections.sort(chars); // sorts out collection type in asc order

        System.out.println(chars);  //[A, B, C, D, O, P, R, S]

        // swap
        ArrayList <String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Jika", "Mika", "Rika", " Erika", "Dashka"));
        //                               0       1       2        3         4
        System.out.println(students); //  [Jika, Mika, Rika,  Erika, Dashka]
        Collections.swap(students,1,4 );
        System.out.println(students);  //[Jika, Dashka, Rika,  Erika, Mika]
        Collections.swap(students,2,3);
        System.out.println(students);  //[Jika, Dashka,  Erika, Rika, Mika]
        Collections.swap(students,0,students.size()-1); // error OutOfBond

        // FREQUENCY
        ArrayList <String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Coffee", "Coffee", "Egg", "Battery", " Battery", "Battery", " Battery"));

        int count = Collections.frequency(items,"Battery");

        System.out.println(count);

        // UNIQUE

        ArrayList<String> unique = new ArrayList<>();

        for(String each: items){
            int i = Collections.frequency(items, each);
            if(i==1){
                unique.add(each);
            }
        }
        System.out.println(unique);   // this is one way of finding the unique

        ArrayList<String> unique2 = new ArrayList<>();
        unique2.addAll(items);

        unique2.removeIf(p -> Collections.frequency(unique2,p)>1);

        System.out.println(unique2);  // this is another way finding of unique

        // MAX  and MIN

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,89,1000,2000,5,7,-50));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("Max:"+ max);
        System.out.println("Min:"+ min);

        Collections.replaceAll(list, 1000,50000);
        System.out.println(list);






    }
}
