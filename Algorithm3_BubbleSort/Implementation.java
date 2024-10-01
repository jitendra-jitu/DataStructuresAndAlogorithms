package Algorithm3_BubbleSort;

public class Implementation {
    public static void main(String[] args) {

        int arr[] = { 5, 8, 1, 9, 3, 7 };

        System.out.println("Before Implementation of BubbleSort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();


        
        int temp = 0;

        System.out.println("At the time of  Implementating  BubbleSort");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

            System.out.print(i + 1 + "iteration: ");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();

        }

    }

}


// Complexity Type	Complexity
// -----------------------------

// Time Complexity	Best: O(n)
//                 Average: O(n^2)
//                 Worst: O(n^2)

// Space Complexity	Worst: O(1)