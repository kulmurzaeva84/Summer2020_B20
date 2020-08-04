package day34_WrapperClasses;
 import java.util.Arrays;
public class WrapperClass_Practice {
    public static void main(String[] args) {
        int[] arr = {1234};

        Integer[] arr2 = {1,2,3,4};
        for(Integer each: arr){ // you can assign to int [] by unboxing            System.out.println(each);
        }

        double[] arr3= {1,2,3,4,5,6,7};
    //  Double[] arr4 = {1,2,3,4,5,6,7}; // should be decimal to be assigned to Double
        Double[] arr4 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0}; // now it works

        for(Double each: arr4){ // double each works as well by unboxing
            System.out.println(each);
        }

        char[] arr5= {65,67,68,69};
        System.out.println(Arrays.toString(arr5)); // [A, C, D, E]

        char ch= 80;
        Character ch2 = 80;
        System.out.println(ch2); // returns P

        String[] num1= {"12.5","13.5","14.5","15.5"};
        double[] num2 = new double[num1.length];

        for(int i =0; i<= num1.length-1; i++){
          num2[i] = Double.parseDouble(num1[i]);
        }
        System.out.println(Arrays.toString(num2));










    }
}
