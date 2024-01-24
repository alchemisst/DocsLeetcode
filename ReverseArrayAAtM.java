import java.util.Arrays;

/**
 * ReverseArrayAAtM
 */
public class ReverseArrayAAtM {

    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,7,9,11,12};
        reverse(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int m){
        int start=m+1;
        int end=arr.length-1;
        int temp;
        while(start<=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}