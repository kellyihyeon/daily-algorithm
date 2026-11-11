package quest.stack;

import java.util.List;
import java.util.Stack;

public class ExclusiveTimeOfFunctions {

    /**
     * 첫번째 함수 push, prevTime 갱신
     * for 문 { ... }
     *          start 면 -> 누적시간 = 현재 시간 - prevTime , prevTime = 현재시간
     *          end 면 ->  누적시간 = 현재 시간 - prevTime + 1, prevTime = 현재시간 + 1
     *          stack 맨 위에 있는 함수에 time 누적하기
     *          end 면 stack 에서 pop, start 면 stack 에 push
     *
     */
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();
        String[] s = logs.getFirst().split(":");
        stack.push(Integer.parseInt(s[0]));
        int prevTime = Integer.parseInt(s[2]);

        for (int i = 1; i < logs.size(); i++) {
            String[] components = logs.get(i).split(":");

            int currentId = Integer.parseInt(components[0]);
            String action = components[1];
            int currentTime = Integer.parseInt(components[2]);

            if (stack.isEmpty()) {
                stack.push(currentId);
                prevTime = currentTime;
            }

            int stackFunctionId = stack.peek();

            if (action.equals("start")) {
                // start 면 -> 누적시간 = 현재 시간 - prevTime , prevTime = 현재시간
                result[stackFunctionId] += currentTime - prevTime;
                prevTime = currentTime;
                stack.push(currentId);
            } else {
                // end 면 ->  누적시간 = 현재 시간 - prevTime + 1, prevTime = 현재시간 + 1
                result[stackFunctionId] += currentTime - prevTime + 1;
                prevTime = currentTime + 1;
                stack.pop();
            }
        }

        return result;
    }

}
