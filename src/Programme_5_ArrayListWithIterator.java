
// Write a Java program to iterate through all elements in an array list using Iterator.

import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5_ArrayListWithIterator {

    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("APPLE");
        fruitList.add("BANANA");
        fruitList.add("BLUEBERRY");
        fruitList.add("MANGO");
        fruitList.add("PINEAPPLE");
        fruitList.add("ORANGE");
        fruitList.add("GUAVA");
        fruitList.add("STRAWBERRY");
        fruitList.add("PASSION_FRUIT");

        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }

}
