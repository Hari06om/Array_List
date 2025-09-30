import java.util.*;
public class SizeArraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Size of ArrayList: " + list.size());
        list.clear();
        System.out.println("Size of ArrayList after clearing: " + list.size());
        // Throws an exception when trying to access an element
        // System.out.println("Element at index 0: " + list.get(0));
    
    }
}