import java.util.*;

class Solution {
    
    // 종류별로 1가지 의상만 착용 가능, 의상이 겹쳐도 상관없으나 유니크한 조합이면 다른 옷 착용한 걸로 가정함
    // 최소 한 개는 입어야 함, 의상은 최대 30개
    // 옷 조합 수 return
    public int solution(String[][] clothes) {    
        // 무엇을 고를까? (선택권 기준)    
        Map<String, Integer> closet = new HashMap<>();

        // 의상별로 갯수 저장
        for(String[] row : clothes) {
            String type = row[1];
            closet.put(type, closet.getOrDefault(type, 0) + 1);
        }
        
        int sum = 1;
        for(String key : closet.keySet()) {
            // type 별로 선택권 구하기
            int none = 1;
            int choice = closet.get(key) + none;
            sum *= choice;
        }
        
        return sum - 1;
    }
}