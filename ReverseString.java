
// 344. Reverse String ~easy

// just swap last and first till they become equal;

public class ReverseString {
        public void reverseString(char[] s) {
            int end=s.length-1;
            for(int i=0;i<end;i++){
                char temp=s[i];
                s[i]=s[end];
                s[end--]=temp;
    
            }
        }
    }

