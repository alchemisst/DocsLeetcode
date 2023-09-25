// 2 solution
// 1. just add each char to result and then subtract both sum you'll get the final diff char
// 2. just xor the 2 string and the final ans will contain the left out char because
//   a^a=0


class DiffChar {
    public char findTheDifference(String s, String t) {
        char ans=0;
        for(char i:s.toCharArray()){
            ans ^= i;
        }
        for(char i:t.toCharArray()){
            ans ^= i;
        }
        return ans;

    }
}