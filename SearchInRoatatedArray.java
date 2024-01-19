// 33. Search in Rotated Sorted Array ~medium
// first find pivot index then check left or right array for the target
// pivot is the index from where the array is rotated


public class SearchInRoatatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target=1;
        int pivot = pivotIndex(nums);
       
        
        if(target>=nums[pivot] && target<nums[nums.length-1]){
            System.out.println("At Index = "+ binarySearch(nums,pivot,nums.length-1,target));   
        }
        else{System.out.println("At Index = "+ binarySearch(nums,0,pivot-1,target)); }
       
            
            
        }
        public static int pivotIndex(int[] nums){
            int start=0;
            int end=nums.length-1;
            int mid;
            while(start<end){
                mid=(start+end)/2;
                if(nums[mid]>=nums[0]){
                    start=mid+1 ;
                }else{
                    end=mid;
                }
            }
            return start;
        }
        public static int binarySearch(int[] nums,int start,int end,int target){
            int mid;
            while(start<=end){
                mid=(start+end)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else{
                    if(nums[mid]>target){
                        end=mid-1;
                    }
                    else{
                        start = mid;
                    }
                }
                
            }
            return -1;
        }
    }

