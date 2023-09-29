public class BinarySRecursion {
    private int[] arr;
    private int leftIndex;
    private int rightIndex;
    BinarySRecursion(int[] a){
        arr=a;
        leftIndex=0;
        rightIndex=a.length-1;
        
    }

    public int search(int number){
        int mid=(leftIndex+rightIndex)/2;
        if(arr[mid]==number){
            return mid;
        }else if(arr[mid]<number){
            leftIndex=mid+1;
            return search(number);

        }
        else{
            rightIndex=mid-1;
            return search(number);

        }
    }

    
    
}
