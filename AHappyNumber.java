// Find a happy AHappyNumber
// happy number = if squaring the digit of a number is recursively it become 1 then its a hppy number
// we storing evey squared digit number in hasset if the number is already in the set it means we're in a enless loop
// return false or if it becomes 1 eventually return true


// second solutiun would be using fast and slow technique
// where fast and slow become equal if cycle is present


public class AHappyNumber {
  
    public boolean isHappy(int n) {
            int ans = digitSquare(n);

            Set<Integer> set=new HashSet<>();
            while(ans!=1){
                set.add(ans);
                ans=digitSquare(ans);
                if(set.contains(ans)){return false;}

            }
            return true;

        }
    public int digitSquare(int n){
        int total=0;
        while(n>0){
            total =total + (n%10)*(n%10);
            n=n/10;
        }
        return total;
    }
    
}


///////////////  second ////////////
class Solution {
    public boolean isHappy(int n) {
            int fast=n;
            int slow=n;
            do{
                slow=digitSquare(slow);
                fast=digitSquare(digitSquare(fast));
            }while(slow!=fast);

            return slow==1;

        }
    public int digitSquare(int n){
        int total=0;
        while(n>0){
            total =total + (n%10)*(n%10);
            n=n/10;
        }
        return total;
    }
}