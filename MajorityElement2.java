// 2 methods
// first is just brute force the approach by creating a hashmap and adding the count and then check for the count if its grreater then n/3;


// 222222222222222222222
// second is only two element will be greater than n/3;
// Intuition: If the array contains the majority of elements,
//  their occurrence must be greater than the floor(N/3). 
//  Now, we can say that the count of minority elements and majority elements is equal up to a certain point in the array. 
//  So when we traverse through the array we try to keep track of the counts of elements and the elements themselves for which we are tracking the counts. 

// After traversing the whole array, we will check the elements stored in the variables. Then we need to check if the stored elements are the majority elements or not by manually checking their counts.





public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int size =nums.length/3;

        int can1=Integer.MIN_VALUE;
        int can2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++){
            if(count1==0 && can2!=nums[i]){
                can1=nums[i];
                count1=1;
            }
            else if(count2==0 && can1!=nums[i]){
                can2=nums[i];
                count2=1;
            }
            else if(can1==nums[i]){count1++;}
            else if(can2==nums[i]){count2++;}
            else{
                count1--;
                count2--;
            }

        }

        List<Integer> ls = new ArrayList<>(); 
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == can1) {count1++;}
            if (nums[i] == can2){count2++;}
        }

        int mini = (int)(nums.length / 3) + 1;
        if (count1 >= mini) ls.add(can1);
        if (count2 >= mini) ls.add(can2);

        return ls;

    }
}