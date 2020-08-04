package day37_Array_List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Jika");
        students.add("Mika");
        students.add("Vika");
        students.add("Rika");
        students.add("Pika");
        students.add("Lika");

        // verify that the names Ulku, Busra are contained in students list

        boolean r1 = students.containsAll( Arrays.asList("Ulku","Busra","Muhtar"));
        System.out.println(r1);
        System.out.println("==============================");

        ArrayList<String> group1 = new ArrayList<>();

        // add students names in your group
        group1.addAll(Arrays.asList("Muhtar","Asiya","Nadir","Jika","Busra","Fatih","Samir","Sardor","Merfu"));
        System.out.println(group1);

        // add your mentor and one of your closest friend's name and verify if they are contained in the list
        boolean r2 = group1.containsAll(Arrays.asList("Jika","Sardor"));
        System.out.println(r2);

        System.out.println("======================================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,1,2,2,3,4,5,5,6,7,8,9,10,11,12,13));

        // remove all 1, 2, 5, 10, 11
        // nums.removeAll(Arrays.asList(1));  // removes all matching ones and returns 2,2.....
        nums.removeAll(Arrays.asList(1,2,5,10,11));
        System.out.println(nums); //  [3, 4, 6, 7, 8, 9, 12, 13]
        System.out.println("==================================");

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,2,2,3,3,3,4,4,5,5,6,6,7,7,8,8,9,9));
        System.out.println(num1);

        // only keep the elements that are either 1 or 2 or 3 or 9
        //retainAll(Collection type) - removes all not matching elements
        num1.retainAll(Arrays.asList(1,2,3,9));
        System.out.println(num1);  // returns [1, 1, 2, 2, 3, 3, 3, 9, 9]

        System.out.println("=========================================");

        ArrayList<String> employeeNames = new ArrayList<>();

        employeeNames.addAll(Arrays.asList("Ahmed", "Muhtar","Ahmed","Virginia","Ahmed"));
        System.out.println(employeeNames);

        employeeNames.retainAll(Arrays.asList("Ahmed", "Jika"));
        System.out.println(employeeNames);

;
















    }
}
