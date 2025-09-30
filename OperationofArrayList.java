import java.util.*;
public class OperationofArrayList {

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // Printing the ArrayList
        System.out.println("Original ArrayList: " + list);
        
        // get element at index 2
        int elementAt2 = list.get(2);
        System.out.println("Element at index 2: " + elementAt2);
    
        // remove element at index 2
        list.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + list);

        // set element 
        list.set(2, 35);
        System.out.println("ArrayList after setting element at index 2: " + list);

        //contain   check if the ArrayList contains a specific element
        System.out.println("ArrayList contains 30? " + list.contains(30));
        //isEmpty check if the ArrayList is empty
        System.out.println("ArrayList is empty? " + list.isEmpty());
        //size get the size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size());
        
    }
}