package day34_WrapperClasses;
import java.util.ArrayList;
public class List_Intro {
    public static void main(String[] args) {

        // should first import ArrayList form java util package
        ArrayList<Integer>scores = new ArrayList<>(); // declaring ArrayList
        scores.add(95); // autoboxing int 95 => Integer 95 // index 0
        scores.add(100); // index 2
        scores.add(85);  // 3
        scores.add(75);  // 4
        scores.add(1,65); //1
        scores.add(5,55); // added 55 to index 5

        System.out.println(scores);

        //100
        System.out.println(scores.get(2)); // ==> returns 100 from index 2



    }
}
