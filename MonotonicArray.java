class Solution {
    
    
    
    ////   Brute force
    ///checking if its decreasing or Increasing on basis of the first two elements
    
    public boolean isMonotonic(int[] nums) {
    if(nums==null || nums.length<3){
        return true;
    }
    int i=0;
    while(nums[i]==nums[i+1] && i<nums.length-1){
        i++;
        if(i==nums.length-1){
            return true;
        }
    }
    
    if(nums[i]<nums[i+1]){

        return checkIncreasing(nums);
        
    }
    else{
        return checkDecreasing(nums);
    }

        
    }


    public boolean checkIncreasing(int[] a){
        int i=0;
        while(i<a.length-1){
            if(a[i]>a[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public boolean checkDecreasing(int[] a){
        int i=0;
        while(i<a.length-1){
            if(a[i]<a[i+1]){
                return false;
            }
            i++;
        }
        return true;
        
    }


    //// Optimized approch
    // In this we take two boolean Increasing and decreasing and set it to true;
    // and change the Increasing or decreasing variable after comparing each element 
    // and then checking after each comparison that if they both are set to false or not
    // if they both are true that means its not monotonic


    public boolean isMonotonic(int[] nums) {
    boolean increasing=true;
    boolean decreasing = true;

    for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            increasing =false;
        }
        else if(nums[i]<nums[i-1]){
            decreasing=false;
        }

        if(!increasing && !decreasing){
            return false
        }
    }
    return true;




    }











}