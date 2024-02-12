
// 1047. Remove All Adjacent Duplicates In String ~easy
// Make a stack and check if the top is same as to the char if yes pop the last element and continue



import java.util.Stack;

public class RemoveAdjacent {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if( !stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }

        }
        StringBuilder answer = new StringBuilder();
        while(!stack.isEmpty()){
            answer.append(stack.pop());
        }
        return answer.reverse().toString();
    }  

}    
}
