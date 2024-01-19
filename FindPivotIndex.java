// 724. Find Pivot Index ~easy

// we have to find the leftmost index where left and right sum become equal
// two methods - find postfix sum array then check prefix sum of each index if it becomes equal then return

// second method find total sum then calc 
// if the left sum(add all left elements from the index) is equal 
// to the right sum(total-nums[i]-currentSum) if yes then return index;



class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
        }
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            int postSum=total-nums[i]-currentSum;
            if(currentSum==postSum){
                return i;
            }
            currentSum += nums[i];
        }
        return -1;
    }
}