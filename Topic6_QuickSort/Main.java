package Algorithm6_QuickSort;

public class Main {

    public static int[] QuickSort(int[] arr, int low, int high) {

        if (low < high) {

            int n = Partition(arr, low, high);

            QuickSort(arr, low, n - 1);
            QuickSort(arr, n + 1, high);
        }
        return arr;
    }

    private static int Partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 7, 2, 9, 1, 66, 24, -1, 0, 7, 4444, 23232 };

        // Perform quicksort on the array
        QuickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}

// # Variation Time Complexity Space Complexity
// -----------------------------------------------------------------
// Best Case O(n log n) O(log n)
// Average Case O(n log n) O(log n)
// Worst Case O(n^2) O(n)