package Algorithm4_SelectionSort;

class implementation {

    public static void main(String[] args) {

        int arr[] = { 9, 4, 6, 0, 2, 8, 7, 3 };

        System.out.println("Before Applying SelectionSort Algorithm");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("After Applying SelectionSort Algorithm at each iteration");
        int temp;
        int largestindex;

        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {

            temp = arr[len - i - 1];
            largestindex = 0;

            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[largestindex]) {
                    largestindex = j;
                }
            }
            

            System.out.print(i+1+"th iteration: ");
            arr[len - i - 1] = arr[largestindex];
            arr[largestindex] = temp;

            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();

        }

    }

}


// Time Complexity Analysis of Selection Sort:
// Best-case: O(n^2), best case occurs when the array is already sorted. (where n is the number of integers in an array)
// Average-case: O(n^2), the average case arises when the elements of the array are in a disordered or random order, without a clear ascending or descending pattern.
// Worst-case: O(n^2), The worst-case scenario arises when we need to sort an array in ascending order, but the array is initially in descending order.


///
// and a space complexity of O(1) 