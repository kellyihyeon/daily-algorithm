package quest.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class BuildAnArrayWithStackOperationsTest {

    @Test
    void buildArrayByCalculatingGaps_case1() {
        List<String> actual = new BuildAnArrayWithStackOperations().buildArrayByCalculatingGaps(new int[]{1, 3}, 3);
        List<String> answer = List.of("Push","Push","Pop","Push");

        assertEquals(answer, actual);
    }

    @Test
    void buildArrayByCalculatingGaps_case2() {
        List<String> actual = new BuildAnArrayWithStackOperations().buildArrayByCalculatingGaps(new int[]{1,2,3}, 3);
        List<String> answer = List.of("Push","Push","Push");

        assertEquals(answer, actual);
    }

    @Test
    void buildArrayByCalculatingGaps_case3() {
        List<String> actual = new BuildAnArrayWithStackOperations().buildArrayByCalculatingGaps(new int[]{1, 2}, 4);
        List<String> answer = List.of("Push","Push");

        assertEquals(answer, actual);
    }

    @Test
    void buildArray_case1() {
        List<String> actual = new BuildAnArrayWithStackOperations().buildArray(new int[]{1, 3}, 3);
        List<String> answer = List.of("Push", "Push", "Pop", "Push");

        assertEquals(answer, actual);
    }

    @Test
    void buildArray_case2() {
        List<String> actual = new BuildAnArrayWithStackOperations().buildArray(new int[]{1, 2, 3}, 3);
        List<String> answer = List.of("Push", "Push", "Push");

        assertEquals(answer, actual);
    }

    @Test
    void buildArray_case3() {
        List<String> actual = new BuildAnArrayWithStackOperations().buildArray(new int[]{1, 2}, 4);
        List<String> answer = List.of("Push", "Push");

        assertEquals(answer, actual);
    }

}