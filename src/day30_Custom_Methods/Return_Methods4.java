package day30_Custom_Methods;

import java.util.Arrays;

public class Return_Methods4 {

    public static void main(String[] args) {
        int[] a1= {1,2,3};
        int[] a2 = {4,5,6};
        int[] a3 = combine2Arrays(a1,a2);
        System.out.println(Arrays.toString(a3));
        System.out.println(a3[0]);
    }

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3= new int[ arr1.length+ arr2.length];

        int i=0;
        for(int each: arr1){
            arr3[i]=each;
            i++;
        }
        for(int each: arr2){
            arr3[i]= each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
        return arr3;
    }

    public static double[] combine2Arrays(double[] arr1, double[] arr2){
        double[] arr4= new double[ arr1.length+ arr2.length];

        int i=0;
        for(double each: arr1){
            arr4[i]=each;
            i++;
        }
        for(double each: arr2){
            arr4[i]= each;
            i++;
        }
        return arr4;
    }
    public static char[] combine2Arrays(char[] arr1, char[] arr2){
        char[] arr5= new char[ arr1.length+ arr2.length];

        int i=0;
        for(char each: arr1){
            arr5[i]=each;
            i++;
        }
        for(char each: arr2){
            arr5[i]= each;
            i++;
        }
        return arr5;
    }
    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr4= new String[ arr1.length+ arr2.length];

        int i=0;
        for(String each: arr1){
            arr4[i]=each;
            i++;
        }
        for(String each: arr2){
            arr4[i]= each;
            i++;
        }
        return arr4;
    }
    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr4= new Integer[ arr1.length+ arr2.length];

        int i=0;
        for(Integer each: arr1){
            arr4[i]=each;
            i++;
        }
        for(Integer each: arr2){
            arr4[i]= each;
            i++;
        }
        return arr4;
    }
    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr4= new Double[ arr1.length+ arr2.length];

        int i=0;
        for(Double each: arr1){
            arr4[i]=each;
            i++;
        }
        for(Double each: arr2){
            arr4[i]= each;
            i++;
        }
        return arr4;
    }
    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        Character[] arr4= new Character[ arr1.length+ arr2.length];

        int i=0;
        for(Character each: arr1){
            arr4[i]=each;
            i++;
        }
        for(Character each: arr2){
            arr4[i]= each;
            i++;
        }
        return arr4;
    }
}
