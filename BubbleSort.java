// Import libraries
import java.util.Random;

/** .
* This program uses a bubble sort.
* The bubble sort will sort an array of numbers.
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-04-07
*/

// Creating class
public final class BubbleSort {

    /** .
     * SIZE is the size of the array.
     */
    private static final int SIZE = 10;

    /** .
     * MAX is the highest number to generate.
     */
    private static final int MAX = 100;

    /** .
     * MIN is the lowest number to generate.
     */
    private static final int MIN = 1;

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private BubbleSort() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) throws Exception {

        // Introduce program to user
        System.out.println("This uses bubble sorting\n"
                + "on an array of numbers.\n");

        // Create a random number generator
        final Random randNum = new Random();

        // Create an array of random numbers
        int[] arrayNum = new int[SIZE];

        // Loop through array
        for (int counter = 0; counter < arrayNum.length; counter++) {

            // Generate a random number and add to array
            arrayNum[counter] = randNum.nextInt(MAX - MIN + 1) + MIN;
        }

        // Print unsorted array
        System.out.print("Unsorted array: ");
        for (int counter = 0; counter < arrayNum.length; counter++) {
            System.out.print(arrayNum[counter] + " ");
        }

        // Bubble sort the array
        for (int counter = 0; counter < arrayNum.length - 1; counter++) {

            // Loop through the array
            for (int innerCounter = 0; innerCounter < arrayNum.length - 1
                 - counter; innerCounter++) {

                // Check if current number is greater than next number
                if (arrayNum[innerCounter] > arrayNum[innerCounter + 1]) {

                    // Swap the numbers
                    int temp = arrayNum[innerCounter];
                    arrayNum[innerCounter] = arrayNum[innerCounter + 1];
                    arrayNum[innerCounter + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("\nSorted array: ");

        // Loop through array
        for (int counter = 0; counter < arrayNum.length; counter++) {
            System.out.print(arrayNum[counter] + " ");
        }

        // New line
        System.out.println("\n");
    }
}
