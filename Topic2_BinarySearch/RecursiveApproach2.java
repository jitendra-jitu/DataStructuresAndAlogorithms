package Algorithm2_BinarySearch;

import java.util.Scanner;

class RecursiveApproach2 {

    public static int Findindex(int[] arr, int num, int low, int high) {

        // Base case: Number not found... stop the Recursion!!
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        // Base case: Number found
        if (num == arr[mid]) {
            return mid;
        }

        // Recur on the right half
        else if (num > arr[mid]) {
            return Findindex(arr, num, mid + 1, high);
        }

        // Recur on the left half
        else {
            return Findindex(arr, num, low, mid - 1);
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 9, 10};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to search in arr: ");
        int num = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;

        int result = Findindex(arr, num, low, high);

        if (result != -1) {
            System.out.println("Number is found at index: " + result);
        } else {
            System.out.println("Given Number is not found..!!");
        }

        sc.close();
    }
}

// Aspect Complexity
// ---------------------
// Time Complexity O(log n)
// Space Complexity O(log n) due to recursion depth
