import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3};
        int k = 2;
        System.out.println(topKFrequent(nums, k));
    }
    public static Map<Integer,List<Integer>> topKFrequent(int[] nums, int k) {
        Map<Integer,List<Integer>> answerMap = new HashMap<>();
        Map<Integer,Integer> frequencyMap= new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            answerMap.put(i,new ArrayList<>());
            frequencyMap.put(nums[i],frequencyMap.getOrDefault(nums[i],0)+1);
        }
        for(int i:frequencyMap.keySet()){
            answerMap.get(frequencyMap.get(i)).add(i);

        }
        
        return answerMap;
    }
}
