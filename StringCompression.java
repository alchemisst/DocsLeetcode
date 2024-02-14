// 443. String Compression ~medium
// EX
// Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

// first we traverse the array and check if the element is after is equal or not if yes we continue 
// if not equal then we store the element and the count in the array by converting it to string 
// like 12 will be stored as "1" and "2" then we'll traverse after that and check for another


class StringCompression{

    public int compress(char[] chars) {
            int i=0;
            int j;
            int ansIndex=0;
            int size = chars.length;
            while(i<size){
                 j=i+1;
                while(j<size && chars[i] == chars[j]){
                    j++;
                }
                chars[ansIndex++] = chars[i];
                int count =j-i;
                if(count>1){
                
                    String ch = Integer.toString(count);
                    for(int k=0;k<ch.length();k++){
                        chars[ansIndex++]=ch.charAt(k);
                    } 
                }
                i=j;
            }
    
            return ansIndex;
            
        }
    }

