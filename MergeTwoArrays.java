// 88. Merge Sorted Array ~easy
// similar to mergig two sorted arrays but in this we try to solve this without taking extra space
// merging arrays into one array that is nums1;

// logic is to sort reverse order;

import java.util.Arrays;

public class MergeTwoArrays {

    
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;int j=n-1;int k=nums1.length-1;
        while(i>=0 && j>=0){
            if(nums1[i]==nums2[j]){
                nums1[k--]=nums2[j--];
                nums1[k--]=nums1[i--];
               
            }
            else if(nums1[i]<nums2[j]){
                nums1[k--]=nums2[j--];
            
            }
            else{
                nums1[k--]=nums1[i--];
            }
        }
        while(i>=0){
            nums1[k--]=nums1[i--];
            
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
    
        }
        
    }
    
}
