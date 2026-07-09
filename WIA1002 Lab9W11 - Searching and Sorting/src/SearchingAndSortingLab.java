import java.util.Arrays;

public class SearchingAndSortingLab {

    // ==========================================
    // Q1: Selection Sort finding the SMALLEST value
    // ==========================================
    public static void selectionSortSmallest(int[] arr) {
        int n = arr.length;
        
        // Loop through the array from the first element to the second-to-last
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current position holds the smallest value
            
            // Scan the rest of the list to find the actual smallest value
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Switch the smallest found value with the value in the current position (i)
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // ==========================================
    // Q2: Selection Sort finding the LARGEST value
    // ==========================================
    public static void selectionSortLargest(int[] arr) {
        int n = arr.length;
        
        // Loop from the last index down to the second index
        // We place the largest items at the end of the array step-by-step
        for (int i = n - 1; i > 0; i--) {
            int maxIndex = 0; // Assume the first element is the largest
            
            // Scan the unsorted part of the list up to index i
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            
            // Switch the largest found value with the value in the last unsorted position (i)
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // ==========================================
    // Q4: Insertion Sort Algorithm
    // ==========================================
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // ==========================================
    // Q3: Test Program / Main Method
    // ==========================================
    public static void main(String[] args) {
        System.out.println("--- TESTING SELECTION SORT (SMALLEST) ---");
        int[] arr1 = {45, 7, 2, 8, 19, 3};
        System.out.println("Original array: " + Arrays.toString(arr1));
        selectionSortSmallest(arr1);
        System.out.println("Sorted array  : " + Arrays.toString(arr1));
        System.out.println();

        System.out.println("--- TESTING SELECTION SORT (LARGEST) ---");
        int[] arr2 = {45, 7, 2, 8, 19, 3};
        System.out.println("Original array: " + Arrays.toString(arr2));
        selectionSortLargest(arr2);
        System.out.println("Sorted array  : " + Arrays.toString(arr2));
        System.out.println();

        System.out.println("--- Q4: TESTING INSERTION SORT ---");
        int[] arr4 = {10, 34, 2, 56, 7, 67, 88, 42};
        System.out.println("Original array: " + Arrays.toString(arr4));
        insertionSort(arr4);
        System.out.println("Sorted array  : " + Arrays.toString(arr4));
    }
}