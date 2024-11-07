def QuickSort(arr,low,high):  
    
    if(low<high):    
        mid = Partition(arr,low,high) 
        QuickSort(arr,low,mid-1)
        QuickSort(arr,mid+1,high)
        
    return arr
  
               
def Partition(arr,low,high):
    
    pivot=arr[high]
    i=low-1 
    for j in range(low,high): 
                  
        if pivot>arr[j]:
            i+=1
            arr[i],arr[j]=arr[j],arr[i]
        
    return i+1


if __name__ == "__main__":
    arr = [3, 7, 2, 9, 1, 66, 24, -1, 0, 7, 4444, 23232]

    # Perform QuickSort on the array
    QuickSort(arr, 0, len(arr) - 1)

    # Print the sorted array
    print("Sorted array:", arr)

    
            

          
        
    
    
    
        
        
    