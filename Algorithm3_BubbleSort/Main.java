package Algorithm3_BubbleSort;

public class Main {


    public static int[] BubbleSort(int[] arr){

        int temp=0;

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }


        return arr;
    }

    public static void main(String[] args) {

        int[] arr={2,1,8,3,5};

        // int[] result=;

        for(int i:BubbleSort(arr)){
            System.out.print(i+" ");

        }


    }
    
}



// Complexity Type	Complexity
// -----------------------------

// Time Complexity	Best: O(n)
//                 Average: O(n^2)
//                 Worst: O(n^2)

// Space Complexity	Worst: O(1)