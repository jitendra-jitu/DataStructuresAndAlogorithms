package Algorithm7_MergeSort;

public class Main {

    public static void main(String[] args) {

        int arr[] = { 4, 2, 7, 2, 9, 1, 6, 8 };

        System.out.println("Before Sorting..");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        MergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting..");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }


    // MergeSort Algorithm
    private static void MergeSort(int[] arr, int left, int right) {

        int mid = (left + right) / 2;

        if (left < right) {

            MergeSort(arr, left, mid);
            MergeSort(arr, mid + 1, right);

            Merge(arr, left, mid, right);
        }
    }



    // Method that joins the splited arrays after sorting in LIFO order
    private static void Merge(int[] arr, int left, int mid, int right) {

        int left_arrsize = mid - left + 1;
        int right_arrsize = right - mid;

        int[] left_array = new int[left_arrsize];
        int[] right_array = new int[right_arrsize];

        // Copying data
        for (int x = 0; x < left_arrsize; x++) {
            left_array[x] = arr[left + x];
        }

        // Copying data
        for (int y = 0; y < right_arrsize; y++) {
            right_array[y] = arr[mid + 1 + y];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Sorting Arrays from both left && right
        while (i < left_arrsize && j < right_arrsize) {

            if (left_array[i] <= right_array[j]) {
                arr[k] = left_array[i];
                i++;
            } else {
                arr[k] = right_array[j];
                j++;
            }
            k++;

        }

        // Add eventually if any of the remainigs in leftarray
        while (i < left_arrsize) {
            arr[k] = left_array[i];
            i++;
            k++;
        }

        // Add eventually if any of the remainigs in rightarray
        while (j < right_arrsize) {
            arr[k] = right_array[j];
            j++;
            k++;
        }

    }
}


// Aspect	Complexity
// ------------------
// Time Complexity	O(n log n)
// Space Complexity	O(n)