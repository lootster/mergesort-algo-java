
# Merge Sort Implementation in Java

This project implements the **Merge Sort** algorithm in Java, a classic recursive sorting technique that divides an array into two halves, sorts them recursively, and then merges them to form a sorted array.

## Features

- Generates an array of random integers.
- Sorts the array using the Merge Sort algorithm.
- Displays the array before and after sorting.

## How It Works

1. **Random Array Generation**: The program generates an array of random integers using the `generateRandomArray()` method. The array size and the upper bound for the random integers can be adjusted via constants.
   
2. **Merge Sort Algorithm**: The `mergeSort()` method recursively splits the array into smaller arrays, sorts them, and then merges them back together in sorted order.
   
3. **Merge Process**: The `merge()` function combines two sorted subarrays into a single sorted array.

## Code Overview

- **`generateRandomArray(int size, int bound)`**: Generates an array of random integers within a given bound.
- **`mergeSort(int[] array)`**: Recursively splits and sorts the array.
- **`merge(int[] array, int[] leftHalf, int[] rightHalf)`**: Merges two sorted halves into a single array.
- **`printArray(int[] array)`**: Prints the elements of an array to the console.

## Usage

### Prerequisites
- Java Development Kit (JDK) installed on your system.

### Running the Program

1. Compile the code:
   ```bash
   javac MergeSort.java
   ```

2. Run the program:
   ```bash
   java MergeSort
   ```

### Example Output
```bash
Before:
45
12
78
23
56

After:
12
23
45
56
78
```

## Customization

You can customize the array size and the range of random numbers by modifying the constants:
```java
final int ARRAY_SIZE = 5;  // Change the array size
final int RANDOM_BOUND = 100;  // Change the upper bound for random numbers
```

## Time Complexity

- **Best Case**: O(n log n)
- **Worst Case**: O(n log n)
- **Average Case**: O(n log n)

## License

This project is free to use and modify for educational purposes.