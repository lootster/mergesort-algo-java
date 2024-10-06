import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        
        // Constants
        final int ARRAY_SIZE = 5;
        final int RANDOM_BOUND = 100;
        
        int[] unsortedArray = generateRandomArray(ARRAY_SIZE, RANDOM_BOUND);

        System.out.println("Before:");
        printArray(unsortedArray);  // Display array before sorting

        mergeSort(unsortedArray);   // Sort the array using merge sort

        System.out.println("\nAfter:");
        printArray(unsortedArray);  // Display array after sorting
    }

    // Generates an array filled with random integers within a given bound
    private static int[] generateRandomArray(int size, int bound) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    // Recursive function to perform merge sort on an array
    private static void mergeSort(int[] array) {

        int arrayLength = array.length;

        // Base case: array with fewer than 2 elements is already sorted
        if (arrayLength < 2)
            return;

        // Find the middle index and divide the array into two halves
        int midIndex = arrayLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrayLength - midIndex];

        // Copy elements into the left half
        for (int i = 0; i < midIndex; i++)
            leftHalf[i] = array[i];

        // Copy elements into the right half
        for (int i = midIndex; i < arrayLength; i++)
            rightHalf[i - midIndex] = array[i];

        // Recursively sort both halves
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge the sorted halves
        merge(array, leftHalf, rightHalf);
    }

    // Function to merge two sorted arrays into a single sorted array
    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0; // Index for left half
        int j = 0; // Index for right half
        int k = 0; // Index for the merged array

        // Merge elements from left and right halves in sorted order
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }

            k++;
        }

        // Copy any remaining elements from the left half
        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right half
        while (j < rightSize) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    // Function to print all elements of the array
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);  // Print each element in the array
        }
    }
}
