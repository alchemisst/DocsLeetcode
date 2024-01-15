//Valid Anagram:  
// first method to make two char array and sort then compare
// second create hashmap and then compare frequence

/**
 * Anagram
 */
class Anagram {
    public static void main(String[] args) {
        System.out.println(checkAnagram("abc", "cba"));
   
    }

    public static boolean checkAnagram(String s,String t) {
        if(s.length()!=t.length()){
            return false;
        }


        Map<Character,Integer> sMap = new HashMap<Character, Integer>();
        Map<Character,Integer> tMap = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),sMap.get(s.charAt(i))+1);
            }
            else{
                sMap.put(s.charAt(i), 1);
            }
            if(tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),tMap.get(t.charAt(i))+1);
            }else{
                tMap.put(t.charAt(i), 1);
            }
        }
        
        return tMap.equals(sMap);
        
    }
    
}