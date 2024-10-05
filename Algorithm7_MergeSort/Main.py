def MergeSort(list,left,right):
    
    mid=(left+right)//2
    if(left<right):
        MergeSort(list,left,mid)
        MergeSort(list,mid+1,right)
        
        Merge(list,left,right,mid)
    
    return list
        
        
def Merge(list,left,right,mid):
    
    list1=list[left:mid+1]
    list2=list[mid+1:right+1]
    list3=[]
    
    i=0
    j=0
    k=left

    while i < len(list1) and j < len(list2):
        if list1[i] < list2[j]:
            list[k] = list1[i]
            i += 1
        else:
            list[k] = list2[j]
            j += 1
        k += 1
        
    while i<len(list1):
        list[k]=(list1[i])
        i+=1
        k+=1
        
    while j<len(list2):
        list[k]=(list2[j])
        j+=1
        k+=1
        
    return list3



if __name__ == "__main__":
    list=[3,1,6,2,4,74,7,0]
    result=(MergeSort(list,0,len(list)-1))
    
    for i in result:
        print(i," ")
    
