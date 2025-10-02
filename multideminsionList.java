import java.util.*;

public class multideminsionList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();
        for(int i =0;i<11;i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        list.add(list1);
        list.add(list2);
        list.add(list3);

        for(int i =0;i<list.size();i++){
         ArrayList<Integer> subList = list.get(i);
         for(int j =0;j<subList.size();j++){
            System.out.print(subList.get(j) + " ");
         }
         System.out.println();

        }

        
    }    
}
