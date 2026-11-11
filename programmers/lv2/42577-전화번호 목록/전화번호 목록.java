import java.util.*;

class Solution {
    
    // 어떤 번호가 다른 번호의 접두어면 false return
    // phone_book 의 최대 길이는 1백만 -> 이중 for문 안됨
    public boolean solution(String[] phone_book) {    
        Map<String, Integer> phoneBooks = new HashMap<>();
        for(String num : phone_book) {
            phoneBooks.put(num, 0);
        }
        
        for(String phoneNumber : phoneBooks.keySet()) {
            int start = phoneNumber.length() - 1;
            
            for(int i= start; i>0; i--) {
                String target = phoneNumber.substring(0, i);
                
                if(phoneBooks.containsKey(target)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}