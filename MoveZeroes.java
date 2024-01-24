//283. Move Zeroes ~easy

// we have to move zeroes to the right 
// we will do by running a loop on j and i at index=0
// we will swap j with i if the jth element is nonzero

import java.util.Arrays;

/**
 * MoveZeroes
 */
 public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {

        int i=0;
        int temp;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
            
        }
        
    }
}