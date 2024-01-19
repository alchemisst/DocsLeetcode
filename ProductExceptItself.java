
// 238. Product of Array Except Self ~medium
// pass two times
// first calc prefix then postix of arraySum


public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int prefix =1;
        int postfix=1;
        for(int i=0;i<nums.length;i++){
            answer[i]=prefix;
            prefix *= nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            answer[i] *= postfix;
            postfix *= nums[i];
        }
        return answer;
    }
} {
    
}
