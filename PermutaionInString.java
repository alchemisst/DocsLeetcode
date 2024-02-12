
// 567. Permutation in String ~medium
// sliding window problem create two hashmap and compare


import java.util.HashMap;
import java.util.Map;

public class PermutaionInString {

    public boolean checkInclusion(String s1, String s2) {
     Map<Character,Integer> string1 = new HashMap<>();
    

     for(int i=0;i<s1.length();i++){
         if(!string1.containsKey(s1.charAt(i))){
             string1.put(s1.charAt(i),1);
         }
         else{
             string1.put(s1.charAt(i),string1.get(s1.charAt(i))+1);
     }
     }

     for(int i=0;i<=s2.length()-s1.length();i++){
        Map<Character,Integer> string2 = new HashMap<>();
        for(int j=i;j<i+s1.length();j++){
            char a = s2.charAt(j);
            string2.put(a,string2.getOrDefault(a,0)+1);
        
     }
        if(string1.equals(string2)){
            return true;
        }
     }
     return false;

    }
}
    


