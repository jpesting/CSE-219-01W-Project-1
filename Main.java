/*
Name: Jonathan Pestinger
Class Number: CIS219
Time: Tuesdays and Thursdays at 3:30pm
*/

public class Main {
    public static void main(String[] args) { // Main method
        int[] store = new int[20]; // Set array "store" to have 20 entries
        for (int i = 0; i < 20; i ++) { // Initialize a loop that will iterate 20 times (the number of entires the new array needs to have)
            store[i] = random(store); // Populate the array with unique data (non-repeating integers 1-30)
        }
        System.out.println(java.util.Arrays.toString(store)); // Print the unique array
    }

    // This method will take in the new array, store
    // Create a random integer, 1-30
    // Iterate through the array and check that the randomly created integer does not already exist in the array
    // Return the unique integer if it does not appear in the array, or randomize the integer again and check the array until it does
    public static int random(int x[]) { // unique number generator that will check for repeating generated numbers
        int result = (int)(Math.random() * 31); // Generate a random integer (1-30)
        for (int i = 0; i < x.length; i++) {  // Iterate through the array (in this case will be "store")
            if(x[i] == result) { // If the randomly created integer is found in the array, repeat the process
                return random(x);
            }
        }
        return result; // If the randomly created integer is not found in the array, 
                       // return that integer so that it can be used in the main method
    }
}