import java.util.Arrays;

public class Merge2Sorted {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));

    }
    public static int[] merge(int[] nums1,int m, int[] nums2,int n) {

        int[] arr=new int[m+n];
        int i=0;int j=0;int k=0;
        while(i<m && j<n){
            if(nums1[i]==nums2[j]){
                arr[k++]=nums1[i];
                arr[k++]=nums2[j];
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i];
                i++;
            }
            else{
                arr[k++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            arr[k++]=nums1[i];
            i++;
        }
        while(j<n){
            arr[k++]=nums2[j];
            j++;
        }
        return arr;

        
    }
}
