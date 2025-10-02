import java.util.*;
public class Swap2number{

    public static void Swap(ArrayList<Integer> list, int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String args[]){
        // list
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original list: " + list);
        
        // Enter the number index 1:
        System.out.print("Enter the number of the index: ");
        int in1= sc.nextInt();
        System.out.print("Enter the number of the index: ");
        int in2= sc.nextInt();
        
        
        Swap(list,in1,in2);
        System.out.println("After Change list: " + list);
        

        
    }
}