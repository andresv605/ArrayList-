package cop2805;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHW2 {
	public static void main(String[] args) {
        // Create an ArrayList of doubles
        ArrayList<Double> myList = new ArrayList<>();

        // Add values to the list
        myList.add(1.5);
        myList.add(2.35);
        myList.add(-4.7);
        myList.add(0.01);

        // Print the original list
        System.out.println("Original List:");
        PrintList(myList);

        // Sort the list
        Collections.sort(myList);

        // Print the sorted list
        System.out.println("\nSorted List:");
        PrintList(myList);

        // Search for 1.5 using binarySearch
        double searchValue = 1.5;
        int index = Collections.binarySearch(myList, searchValue);

        // Print the index where 1.5 was found
        if (index >= 0) {
            System.out.println("\nFound " + searchValue + " at index " + index);
        } else {
            System.out.println("\n" + searchValue + " not found in the list.");
        }

        //Zero out list
        Collections.fill(myList, 0.0);

        // Print the list after filling with zeros
        System.out.println("Zero List:");
        PrintList(myList);
    }
	
    //Print List method
    public static void PrintList(ArrayList<Double> list) {
        for (Double item : list) {
            System.out.println(item);
        }
    }

}
