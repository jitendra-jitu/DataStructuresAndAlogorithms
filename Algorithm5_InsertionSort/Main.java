package Algorithm5_InsertionSort;

public class Main {

    public static int[] InsertionSort(int[] arr) {

        int len = arr.length;

        int temp;

        int j;

        for (int i = 1; i < len; i++) {

            temp = arr[i];

            j = i - 1;

            while (j >= 0 && arr[j] > temp) {

                arr[j + 1] = arr[j];
                j--;

            }

            arr[j + 1] = temp;

        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = { 2, 1, 5, 7, 3, 9, 2 };

        int[] result = InsertionSort(arr1);

        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}

// Time Complexity of Insertion Sort Algorithm:
// -------------------------------------------

// Best Case: O(N)

// Average Case: O(N^2)

// Worst Case: O(N^2)

// Space Complexity: O(1)

// The auxiliary space complexity of Insertion Sort is O(1), indicating it uses
// constant extra space regardless of the input size.






///
/////
///////
///////// NOTE
// ----

// Insertion Sort is efficient for small data sets or nearly sorted arrays,
// making it a good choice for certain scenarios despite its average and
// worst-case quadratic time complexity.