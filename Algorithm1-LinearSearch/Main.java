package LinearSearch;

import java.util.Scanner;

public class Main {

    public static int LinearSearch(int[] arr,int num){

        for(int index =0;index<arr.length;index++){
            if(arr[index]==num){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        int arr[]={2,4,6,8,9,8};

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value to search in arr");
        int num=sc.nextInt();

        if(LinearSearch(arr,num)!=-1){
            System.out.println(num+" found at index :"+LinearSearch(arr,num));
        }
        else{
            System.out.println("Given number is not in the Array");
        }
        
    }
    
}




// Aspect	Complexity
// ----------------------
// Time Complexity	-O(n)
// Space Complexity -O(1)
