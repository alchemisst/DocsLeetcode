public class FirstNLastOccurenceinSortedArray {
    public static void main(String[] args) {
        int arr[] = {2,3,6,6,7,8,9};

        int[] ans=new int[2];
        ans[0]=searchIndex(arr, 6, true);
        ans[1]=searchIndex(arr, 6, false);
        System.out.println(ans[0]+" and "+ans[1]);
    }
    public static int searchIndex(int[] array,int target,boolean leftBias){
        int i =-1; 
        int mid;
        int low = 0;
        int high = array.length;
        while(low<=high){
            mid=(low+high)/2;
            if(array[mid]<target){
                low=mid+1;
            }
            else if(array[mid]>target){
                high=mid-1;
            }
            else{
                i=mid;
                if(leftBias){
                    high=mid-1;
                }else{
                    low=mid+1;

                }
            }

            
        }
        return i;
    }
}
