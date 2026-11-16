import java.util.*;

// time = 58분
class Solution {
    
    // 정사각형 격자 인형뽑기
    // 같은 숫자 == 같은 모양
    // 같은 모형 인형이 바구니에 연속해서 쌓이면 두 인형은 터진다. 인형이 없는 곳은 아무일도 일어나지 않는다.
    public int solution(int[][] board, int[] moves) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int target : moves) {    
            for(int i=0; i<board.length; i++) {
                int doll = board[i][target - 1];
                
                // 인형이 없으면 아무일도 일어나지 않는다.
                if(doll == 0) continue;
                
                board[i][target - 1] = 0;
                
                if(!stack.isEmpty() && doll == stack.peek()) {
                    stack.pop();
                    count += 2;
                } else {
                    stack.push(doll);
                }
                
                break;
            }
            
        }
        
        return count;
    }
}