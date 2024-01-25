// 1752. Check if Array Is Sorted and Rotated ~easy
 
// taking count variable to find the middle pivot and increase by 1 because only one time the left element would 
// be greater than right if count is 0 then true if greter than 1 return false if 1 check for two case if last element smaller or equal if yes then
// return true if not false


class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        else if(count>1){
            return false;
        }
        else{
            if(nums[0]>=nums[nums.length-1]){
                return true;
            }
            return false;
        }
    }
}