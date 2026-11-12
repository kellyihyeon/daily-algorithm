import java.util.*;

class Solution {
    
    // () : 짝이 맞으면 올바른 괄호, 문자열 s가 올바른 괄호면 true return
    // s 는 최대 10만 
    // s 를 하나씩 뜯는다
        // ( : 스택에 넣는다
        // ) : 스택에 있는 원소 peek 해서 ( 면 pop 한다 (stack 이 비어있지 않은 경우)
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(stack.isEmpty() && c == ')') {
                return false;
            }
            
            if(c == '(') {
                stack.push(c);
                continue;
            }
            
            if(c == ')') {
                if(stack.peek() == '(') {
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty();
    }
}