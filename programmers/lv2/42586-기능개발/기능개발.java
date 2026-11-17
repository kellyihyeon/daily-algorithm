import java.util.*;

// time = 40분
class Solution {
    
    // 배포 순서는 task 순서를 지켜야 한다.
    // 작업 개수는 최대 100개, 작업 진도와 속도도 최대 100
    // 각 배포마다 몇 개 기능을 배포할 수 있는지 return
    
    // [93, 30, 55] -> [1, 30, 5]
        // days = {7, 3, 9}
        // 1: remain 7 -> 7
        // 2: remain 70 -> 나머지가 0 이면 몫, 나머지가 0이 아니면 몫+1day
        // 3: remain 45 -> 9
        // for 문 돌면서 체크. max = days[0], list = {}
            // max(7), tasks = 1;
            // max vs 3 -> max 가 더 크거나 같으면 tasks += 1;
            // max vs 9 -> max 가 더 작으면 list.add(tasks), max = new max, tasks = 1
    public int[] solution(int[] progresses, int[] speeds) {
        // days 계산
        int[] days = new int[progresses.length];
        for(int i=0; i<progresses.length; i++) {
            int remainDays = 100 - progresses[i];
            int speed = speeds[i];
            
            int remainder = remainDays % speed;
            
            if(remainder == 0) {
                days[i] = remainDays / speed;
            } else {
                days[i] = (remainDays / speed) + 1;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        int max = days[0];
        int tasks = 1;
        
        // 몇 개 배포할 수 있는지 계산
        for(int i=1; i<days.length; i++) {
            if(max >= days[i]) {
                tasks += 1;
            } else {
                list.add(tasks);
                max = days[i];
                tasks = 1;
            }
        }
        
        // 마지막 task 저장
        list.add(tasks);
    
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}