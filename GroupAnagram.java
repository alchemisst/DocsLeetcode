49. Group Anagrams ~medium
// creater a


import java.util.*;



/**
 * GroupAnagram
 */
public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagram(strs));

    }
    public static List<List<String>> groupAnagram(String[] strs){
                Map<String,List<String>> result = new HashMap<>();
                for(String word:strs){
                    char[] chars= word.toCharArray();
                    Arrays.sort(chars);
                    String keyWord = new String(chars);
        
                    if(!result.containsKey(keyWord)){
                        List<String> list = new ArrayList<>();
                        result.put(keyWord,list);
                    }
                    result.get(keyWord).add(word);
        
        
                }
                return new ArrayList<>(result.values());
        
        
            }
        }