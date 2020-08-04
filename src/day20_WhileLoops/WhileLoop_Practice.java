package day20_WhileLoops;

public class WhileLoop_Practice {
    public static void main(String[] args) {
        for(int i =1; i<= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        int num=1;
        while(num<=10){
            System.out.println(num+" ");
            num++;
        }
        System.out.println("=================");

        int i = 1;
        while(i <= 5){
            System.out.println("Jika");
            i++;
        }
        System.out.println("==============");

        String str = "Cybertek";
        //            01234567
        String result ="";
        int index = str.length()-1;
        while(index >= 0){
            result += str.charAt(index);
         index--;
        }
        System.out.println(result);

        System.out.println("===============");

        int a =0;
        while(a<=6);
        a+=2;
        System.out.println(a);
















    }
}
