import java.util.*; // Importing all classes from java.util package for ArrayList

public class StoreWater {

    // Method to calculate and print water stored between bars
    public static void storeWater(ArrayList<Integer> height) {
        int n = height.size(); // Get the number of bars
        int water = 0; // Variable to store the water stored
        // Outer loop to pick the first bar
        for (int i = 0; i < n; i++) {
            // Inner loop to pick the second bar
            for (int j = i + 1; j < n; j++) {
                int ht = Math.min(height.get(i), height.get(j)); // Find the minimum height between the current bars
                // Calculate the water stored between the current bars
                int width = j-i; // Calculate the width between the current bars
                int cntWater = (ht * width); // Add the calculated water to the total water
                water = Math.max(water, cntWater); // Update the water stored if the calculated water is greater

            }
        }
        System.out.println("Water stored between bars: " + water); // Print the water stored
    }

    // Main method to run the program
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(); // Create an ArrayList to store heights

        // Add heights to the ArrayList
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        storeWater(height); // Call the method to calculate water storage
    }
}