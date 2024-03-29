//125. Valid Palindrome ~easy

public class ValidPalindrome {
   
        public boolean isPalindrome(String s) {
    
            int start=0;
            int end=s.length()-1;
            char charStart;
            char charEnd;
        
            while(start<=end){
                charStart = s.charAt(start);
                charEnd = s.charAt(end);
                if(!Character.isLetterOrDigit(charStart)){start++;}
                else if(!Character.isLetterOrDigit(charEnd)){end--;}
    
                else{
                    if(Character.toLowerCase(charStart)!=
                    Character.toLowerCase(charEnd)){return false;}
                    start++;
                    end--;
                    }
                
                
            }
            return true;
        }
    }

