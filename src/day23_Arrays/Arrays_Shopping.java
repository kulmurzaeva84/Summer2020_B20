package day23_Arrays;

public class Arrays_Shopping {
    public static void main(String[] args) {
        String[] shoppingList= new String[7];
        shoppingList[0]= "Toilet paper";
        shoppingList[1]= "Hand sanitizer";
        shoppingList[4]= "Eggs";
        shoppingList[2]= "Corona Beer";
        shoppingList[3]= "Milk";
        shoppingList[5]= "Water";
        shoppingList[6]= "Potatoes";

        for(int i = 0; i<=shoppingList.length-1; i++){
            System.out.println(shoppingList[i]);

        }



    }
}
