package day28_Reacap;
import java.util.Arrays;
public class Arrays_ShortQuiz {
    public static void main(String[] args) {
        char[]arr= {'D','C', 'B','A'};
        Arrays.sort(arr); // ABCD

        for(char each: arr){ // ABCD
            System.out.println(each); // ABCD it prints all since Print statement is before if statement
            if(each== 'D'){
                continue;
            }
        } // // ABCD it prints all since Print statement is before if statement

        System.out.println();

        int wd=0;
        String []days = {"sun","mon", "wed", "sat"};
        for(int i=0; i<days.length; i++){

            switch(days[i]){
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd ++;
                case "wed":
                    wd +=2;

            }
        }
        System.out.println(wd);
        System.out.println("==================");

        int[]a= {1,2,3,4};
        int y=0;

        do{
            System.out.println(a[y]);
            y++;
        }while(y < a.length-1);



    }
}
