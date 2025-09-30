import java.util.*;

public class maxiList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>(n);
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int max = Collections.max(list);
        System.out.println("The maximum element in the list is: " + max);
        sc.close();
    }
}
