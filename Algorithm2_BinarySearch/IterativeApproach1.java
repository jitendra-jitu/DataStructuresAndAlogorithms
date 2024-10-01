package Algorithm2_BinarySearch;

class IterativeApproach1 {

    // Approach-1
    public static int BinarySearchAlgorithm(int[] arr, int num) {
        int low = 0, high = arr.length - 1, mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (num == arr[mid]) {
                return mid;
            } else if (num > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 9 };
        int num = 4;

        int result = BinarySearchAlgorithm(arr, num);

        if (result != -1) {
            System.out.println(num + " is found at index: " + result);
        } else {
            System.out.println(num + " not found..!!");
        }
    }
}

// What is Binary Search Algorithm?
// -----------------------------------
// Binary search is a search algorithm used to find the position of a target
// value within a sorted array. It works by repeatedly dividing the search
// interval in half until the target value is found or the interval is empty.
// The search interval is halved by comparing the target element with the middle
// value of the search space.

// Aspect Complexity
// Time Complexity O(log n)
// Space Complexity O(1)
