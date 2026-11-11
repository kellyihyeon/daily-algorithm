package quest.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EvaluateReversePolishNotationTest {

    @Test
    void evalRPN_case1() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int actual = new EvaluateReversePolishNotation().evalRPN(tokens);
        int answer = 9;

        assertEquals(answer, actual);
    }

    @Test
    void evalRPN_case2() {
        String[] tokens = {"4","13","5","/","+"};
        int actual = new EvaluateReversePolishNotation().evalRPN(tokens);
        int answer = 6;

        assertEquals(answer, actual);
    }

    @Test
    void evalRPN_case3() {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int actual = new EvaluateReversePolishNotation().evalRPN(tokens);
        int answer = 22;

        assertEquals(answer, actual);
    }
}