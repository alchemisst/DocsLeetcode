// 189. Rotate Array ~medium
// we have to rotate array k times 
// first method take new array and find the position of the element after k rotation;
// second reverse the input array then reverse k element then remaining elements

class Solution_1 {
    public void rotate(int[] nums, int k) {
        int[] answer=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            answer[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=answer[i];
        }
        
    }
}

class Solution_2 {
    public void rotate(int[] nums, int k) {
       k=k%nums.length;
       reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
       }
    
    public void reverse(int nums[],int start, int end){
       int temp;
       while(start<end){
           temp=nums[start];
           nums[start++]=nums[end];
           nums[end--]=temp;
       }
    }
    
}