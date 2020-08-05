package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
         /*
        how many students made:
                A?
                B?
                C?
                D?
        how many failed?
        DO NOT use loop
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeA = new ArrayList<>(); // 90 ~ 100
        gradeA.addAll(list);  // first we store all the grades
        gradeA.removeIf(p -> p < 90 );  // then we remove the grades that are not A
        System.out.println("Grade A: "+ gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>(); // 80 ~ 89
        gradeB.addAll(list);   // first we store all the grades
        gradeB.removeIf( each -> each <80 || each > 89 );  // then we remove the grades that are not B
        System.out.println("Grade B: "+gradeB);


        ArrayList<Integer> gradeC = new ArrayList<>(); // 70 ~ 79
        gradeC.addAll(list);
        gradeC.removeIf(p -> p<70 || p>79);
        System.out.println("Grade C: "+ gradeC);


        ArrayList<Integer> gradeD = new ArrayList<>(); // 60 ~ 69
        gradeD.addAll(list);
        gradeD.removeIf(p -> p<60 || p>69);
        System.out.println("Grade D:" + gradeD);


        ArrayList<Integer> gradeF = new ArrayList<>(); // 0 ~ 59
        gradeF.addAll(list);
        gradeF.removeAll(gradeA); // OR gradeF.removeIf(p -> p > 59);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        System.out.println("Grade F:"+ gradeF);

        // how many students made A, B, C ,D F grades
        // for it we need to get the size of students
        System.out.println(gradeA.size()+ " students made A");
        System.out.println(gradeB.size()+ " students made B");
        System.out.println(gradeC.size()+ " students made C");
        System.out.println(gradeD.size()+ " students made D");
        System.out.println(gradeF.size()+ " students failed");



    }
}
