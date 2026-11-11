package quest.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuildAnArrayWithStackOperations {

    public List<String> buildArrayByCalculatingGaps(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int index = 1;

        for (int num : target) {
            while (index < num) {
                result.add("Push");
                result.add("Pop");
                index++;
            }

            result.add("Push");
            index++;
        }

        return result;
    }

    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0;

        for (int i = 1; i < n + 1; i++) {
            stack.push(i);
            result.add("Push");

            if (target[index] == stack.peek()) {
                index++;
            } else {
                stack.pop();
                result.add("Pop");
            }

            if (index == target.length) {
                break;
            }
        }

        return result;
    }
}
