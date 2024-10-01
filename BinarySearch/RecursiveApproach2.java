// package BinarySearch;
// import java.util.Arrays;
import java.util.Scanner;

class RecursiveApproach2 {

    public static int Findindex(int[] arr,int num,int low, int high) {
    
        int mid=(low+high)/2;

            if(num==arr[mid]){
                return mid;
            }
            else if(low==high){
                return -1;
            }
            else if(num>arr[mid]){
                return Findindex(arr,num,mid+1,high);
            }
            else{
                return Findindex(arr,num,low,mid-1 );
            }
    }

    public static void main(String[] args) {

        int arr[]={2,4,6,8,9,10};

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value to search in arr");
        int num=sc.nextInt();

        int low=0;
        int high=arr.length-1,mid;

        int result=Findindex(arr,num,low,high);

        if(result!=-1){
            System.out.println("number is found at index :"+result);
        }
        else{
            System.out.println("Given Number is not found..!!");
        }
    }
}



// Aspect	Complexity
// ---------------------
// Time Complexity	O(log n)
// Space Complexity	O(log n)

    
