package quest.stack;

import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    // 정수를 담는 stack 을 생성한다.
    // tokens 루프를 돈다. index 는 하나씩 increment!
        // 1. token == 정수이면, stack 에 push
        // 2. token == operator 라면, stack 에서 정수를 두 번 pop
    // 각 operator 의 연산을 추출해서, 정수와 연산자를 계산하고 결과값을 stack 에 push
    public int evalRPN(String[] tokens) {
        List<String> operator = List.of("+", "-", "*", "/");
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!operator.contains(token)) {
                stack.push(Integer.valueOf(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(calculate(a, b, token));
            }
        }

        return stack.pop();
    }

    private Integer calculate(int a, int b, String token) {
        return switch (token) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> null;
        };
    }
}
