//KMP algo used which checks th epattern in the needle then start checking in haystack to help 


public class OccurenceOfString {
        public int strStr(String haystack, String needle) {
             
             if(needle =="") return 0;
             int[] lpsArray=failureFunc(needle);
             int i=0;
             int j=0;
             while(i<haystack.length()){
                 if(haystack.charAt(i)==needle.charAt(j)){
                     i++;
                     j++;
                 }
                 else{
                     if(j==0){
                         i++;
                     }
                     else{
                         j=lpsArray[j-1];
                     }
                 }
                 if(j==needle.length()){
                     return i-j;
                 }
     
             }
            return -1;
             }
             
           
         
        
     
      static int[] failureFunc(String a){
             int len = a.length();
             int[] lps = new int[len];
             lps[0]=0;
             int i=1;
             int prevLPS=0;
             while(i<len){
                 if(a.charAt(i)==a.charAt(prevLPS)){
                     lps[i]=prevLPS+1;
                     prevLPS++;
                     i++;
                 }
                 else{
                     if(prevLPS==0){
                         lps[i]=0;
                         i++;
                     }
                     else{
                         prevLPS=lps[prevLPS-1];
                     }
                 }
                 
                 
             }
             return lps;
             
             
             
             
         }
         }

