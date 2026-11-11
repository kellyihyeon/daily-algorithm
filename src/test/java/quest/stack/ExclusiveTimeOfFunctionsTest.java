package quest.stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ExclusiveTimeOfFunctionsTest {

    @Test
    void exclusiveTime_case1() {
        int n = 2;
        List<String> logs = List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6");

        int[] actual = new ExclusiveTimeOfFunctions().exclusiveTime(n, logs);
        int[] answer = {3, 4};

        assertArrayEquals(answer, actual);
    }

    @Test
    void exclusiveTime_case2() {
        int n = 1;
        List<String> logs = List.of("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7");

        int[] actual = new ExclusiveTimeOfFunctions().exclusiveTime(n, logs);
        int[] answer = {8};

        assertArrayEquals(answer, actual);
    }

    @Test
    void exclusiveTime_case3() {
        int n = 2;
        List<String> logs = List.of("0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7");

        int[] actual = new ExclusiveTimeOfFunctions().exclusiveTime(n, logs);
        int[] answer = {7, 1};

        assertArrayEquals(answer, actual);
    }

    @Test
    void exclusiveTime_case4() {
        int n = 2;
        List<String> logs = List.of("0:start:0", "0:start:2", "0:end:5", "1:start:7", "1:end:7", "0:end:8");

        int[] actual = new ExclusiveTimeOfFunctions().exclusiveTime(n, logs);
        int[] answer = {8, 1};

        assertArrayEquals(answer, actual);
    }

    @Test
    void exclusiveTime_case5() {
        int n = 3;
        List<String> logs = List.of("0:start:0", "0:end:0", "1:start:1", "1:end:1", "2:start:2", "2:end:2", "2:start:3", "2:end:3");

        int[] actual = new ExclusiveTimeOfFunctions().exclusiveTime(n, logs);
        int[] answer = {1, 1, 2};

        assertArrayEquals(answer, actual);
    }

}