package SelectionSort;

public class Main {

    // Algorithm
    // ---------
    // Finding Largest_Value and placing it at (i-1)th index at every iteration
    // i.e swapping the indexes (i-1) and (largestvalueindex ) only once at each
    // iteration

    public static int[] SelectionSort(int arr[]) {

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

            arr[len - i - 1] = arr[largestindex];
            arr[largestindex] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 9, 2, 6, 7, 1, 4, 7, 5, 1, 0, 3, 5 };

        int[] result = SelectionSort(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}



// time complexity of O(n^2) 
// and a space complexity of O(1) 
