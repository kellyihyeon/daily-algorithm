import java.util.*;

class Process {
    int index;
    int priority;

    public Process (int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
    
    public String toString() {
        return "index = " + index + ", priority = " + priority;
    }
    
}

// time = 72분 걸림
class Solution {
    
    // os 가 특정 프로세스를 몇 번째로 실행하는지 return
    // 프로세스는 최대 100개, 숫자가 클수록 우선순위가 높다!
    // location 은 0번부터 시작
    
    // [0(2), 1(1), 2(3), 3(2)]
    // p2 추출: p3이 더 높음 -> 맨 뒤로 보냄 -> [1(1), 2(3), 3(2), 0(2)]
    // p1 추출: p3이 더 높음 -> 맨 뒤로 보냄 -> [2(3), 3(2), 0(2), 1(1)]
    // p3 추출: 우선순위 당첨 -> [3(2), 0(2), 1(1)]
    
    // process = (index, priority) <- [0(2), 1(1), 2(3), 3(2)]
    // queue 에서 poll vs priorityQ 에서 poll(max)
        // max == process.priority 같으면?
            // process.index == location -> count 바로 return
            // process.index != location 
                // index 가 일치하는 곳에 count 저장 [0,0,1,0] -> count++ -> max 교체

        // 다르면 queue 에 다시 add

    public int solution(int[] priorities, int location) {
        // priority 만들기
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int p : priorities) {
            priorityQueue.offer(p);
        }
        
        System.out.println("priorityQueue = " + priorityQueue);
        
        // queue 만들기
        Queue<Process> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));    
        }
        
        System.out.println("queue = " + queue);
        
        // 우선순위 비교
        int max = (int) priorityQueue.poll();
        int count = 1;
        int[] orders = new int[priorities.length];
        
        while(!queue.isEmpty()) {
            Process process = queue.poll();
            int index = process.index;
            int priority = process.priority;
            
            if(max == priority) {
                if(index == location) {
                    return count;
                }
                orders[index] = count;
                count++;
                max = priorityQueue.poll();
                
            } else {
                queue.offer(process);
            }
        }
        
        return -1;
    }
}