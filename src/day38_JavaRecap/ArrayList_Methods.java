package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        // remove, size, set, get, equals, contains, clear

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes", "Infinity", "Tesla", "WV", "Lamborghini", " Lexus", "Tesla"));

        //cars.remove("Tesla"); // removes only one first matching value
        //cars.remove(3);  // we can remove by providing the value or index number of the element
        // cars.removeAll(Arrays.asList("Tesla));  // removes more than one Tesla from the list we need to use
        //cars.removeIf(p -> p.toLowerCase().contains("m"));  //removes all the elements that are matching condition
        // cars.retainAll(Arrays.asList("Tesla"));  // removes not matching elements, or keeps Tesla and removes all others

        System.out.println(cars);
        System.out.println("==============================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs", "Milk", "Mango", "Orange", "Avocado", "Dragon Fruit"));

        // contain
        boolean r1 = groceryList.contains("Pepsi"); // checks only one item
        System.out.println(groceryList);
        System.out.println(r1);

        //containAll
        boolean r2 = groceryList.containsAll(Arrays.asList("Eggs", "Milk","Orange"));
        System.out.println(r2);

        // size
        System.out.println("Total Number of Items: "+ groceryList.size()); // returns 5

        // set : set apple instead of Dragon fruit
        groceryList.set(groceryList.size()-1, "Apple"); // the last element from the list now will be Apple
        // or we can provide index number instead of size()-1
        groceryList.set(groceryList.indexOf("Mango"), "Melon");  // we replaced Mango with Melon

        System.out.println(groceryList);

        //clear
        groceryList.clear();
        System.out.println(groceryList); // returns []


















    }
}
