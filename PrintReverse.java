import java.util.*;

public class PrintReverse {
    public static void printReverse(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
        System.out.println("Reversed list: " + list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original list: " + list);
        printReverse(list);
        list.clear();
        System.out.println("Cleared list: " + list);

    }
}
