package day24_Arrays;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
public class Arrays_Utility {
    public static void main(String[] args) {

        // ! Arrays.toString(varName) in order to print an arr
        // we Must convert it to String

        int [] arr = {1, 2, 3};
        System.out.println(arr);  // !!! Any arr MUST be converted to String when printing
        System.out.println(Arrays.toString(arr));

        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String[] names = {"Muhtar", "Jika", "Mika", "Daika", "Erika"};
        System.out.println(Arrays.toString(names));

        // ! Arrays.sort(arr) : sorts the array in ascending order

        int[] nums = {5, 4, 6, 5, 4, 3, 10};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums); // [3,4,4,5,5,6,10]

        System.out.println(Arrays.toString(nums));

        System.out.println("Max number: "+ nums[nums.length-1]);

//   to get the Max number yu can first sort it in ascending order and then retrieve
//   the last num and it will be your Max number

        String students[] = {"Dashok", "Krikushka", "Taineshka", "Mika", "Jika"};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("======================================");
//      ! Arrays.equals(arr1, arr2) Compares the arrays, arr sizes should be equal
//       ! returns boolean
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2);
         // checks the element index by index
        System.out.println(r1); // ==> true
        int[]arr3 = {2,1,3};
        Arrays.sort(arr2); // 1 2 3
        Arrays.sort(arr3);  // 1 2 3

        boolean r2 = Arrays.equals(arr2, arr3);
        System.out.println(r2);

        int[]arr4= {1,1,2,3};
        int[]arr5= {1,2,3};
        boolean r3 = Arrays.equals(arr4, arr5);
        System.out.println(r3); // ==>  false




    }
}
