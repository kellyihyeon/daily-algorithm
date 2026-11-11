import java.util.*;

// time: 12분 걸림
class Solution {
    
    // 참여자 array, 완주자 array -> 완주하지 못한 선수 return
    // 참여자는 최대 10만명, 완주하지 못한 사람은 1명만 있다, 동명이인도 있음
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> checker = new HashMap<>();
        
        for(String p : participant) {
            checker.put(p, checker.getOrDefault(p, 0) + 1);
        }
        
        for(String c : completion) {
            checker.put(c, checker.get(c) - 1);
        }
        
        for(String key : checker.keySet()) {
    
            if(checker.get(key) == 1) {
                return key;
            }
        }
        
        return "";
    }
}