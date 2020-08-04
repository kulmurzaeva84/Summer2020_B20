package day37_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,8,9));

       //  Predicate<Integer> lessThan5 = p -> p < 5;

        list.removeIf(p -> p < 5); // OR list.removeIf(lessThan5)
        System.out.println(list);

        System.out.println("=======================================");

        Predicate<Integer> oddNumbers = p -> p %2 != 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<=100; i++){
            numbers.add(i);
        }
        numbers.removeIf(oddNumbers);  // removes all odd numbers
        numbers.removeIf(p-> p % 2 ==0); // with this expression no need of a loop
        // removes all even numbers
        System.out.println(numbers);
        System.out.println("=======================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary", "Monica", "Kate","Helen", "Erika"));

        names.removeIf(each -> each.startsWith("M") && each.endsWith("y")); // each == p can be any letter or word
        System.out.println(names);

        System.out.println("======================================");

// Remove the elements that are not unique
        ArrayList<Integer>  nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,6,7,8,8,9));

        nums.removeIf(p -> Collections.frequency(nums, p)!=1);
        //                 for the elements that are not unique
        System.out.println(nums);
        System.out.println("===========================================");




    }
}
