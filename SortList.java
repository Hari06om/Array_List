import java.util.*;
public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(6);
        list.add(7);

        System.out.println("Orginal List: "+ list);  
        Collections.sort(list);
        System.out.println("Assending order sort list : "+ list);  
        Collections.sort(list, Collections.reverseOrder());  
        System.out.println("Dissending order Sort List: "+ list);  

    }
}
