package InsertionSort;

public class Main {

    public static int[] InsertionSort(int[] arr) {

        int len = arr.length;

        int temp;

        int j;

        for (int i = 1; i < len; i++) {

            temp = arr[i];

            j = i - 1;
 
            while (j>=0 && arr[j] > temp ) {

                arr[j + 1] = arr[j];
                j--;
                 
            }

            arr[j+1]=temp;

        }

        return arr;
    }

    public static void main(String[] args) {



        int[] arr1={2,1,5,7,3,9,2};

        int[] result=InsertionSort(arr1);

        for(int i:result){
            System.out.print(i+" ");
        }

    }

}
