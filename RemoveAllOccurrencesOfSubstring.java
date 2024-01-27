
//1910. Remove All Occurrences of a Substring ~medium

/**
 * RemoveAllOccurrencesOfSubstring
 */
public class RemoveAllOccurrencesOfSubstring {
    

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeSubs(s, part));
        
    }
    public static String removeSubs(String s,String part){
       
        int index = s.indexOf(part);

        while(index!=-1){
            s=s.substring(0, index)+s.substring(index+part.length());
            index = s.indexOf(part);
        }
        
        
        
        return s;
    }


    
}