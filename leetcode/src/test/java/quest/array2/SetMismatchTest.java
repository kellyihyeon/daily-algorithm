package quest.array2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SetMismatchTest {

    @Test
    void findErrorNums_case1() {
        int[] input = {1, 2, 2, 4};
        int[] expected = {2, 3};

        SetMismatch solver = new SetMismatch();
        assertAll("모든 구현 방식 검증",
                () -> assertArrayEquals(expected, solver.findErrorNums(input.clone())),
                () -> assertArrayEquals(expected, solver.usingExtraArray(input.clone()))
        );
    }

    @Test
    void findErrorNums_case2() {
        int[] input = {1, 1};
        int[] expected = {1, 2};

        SetMismatch solver = new SetMismatch();
        assertAll("모든 구현 방식 검증",
                () -> assertArrayEquals(expected, solver.findErrorNums(input.clone())),
                () -> assertArrayEquals(expected, solver.usingExtraArray(input.clone()))
        );
    }

    @Test
    void findErrorNums_case3() {
        int[] input = {1, 2, 3, 4, 5, 6, 6, 8, 9};
        int[] expected = {6, 7};

        SetMismatch solver = new SetMismatch();
        assertAll("모든 구현 방식 검증",
                () -> assertArrayEquals(expected, solver.findErrorNums(input.clone())),
                () -> assertArrayEquals(expected, solver.usingExtraArray(input.clone()))
        );
    }

    @Test
    void findErrorNums_case4() {
        int[] input = {3, 2, 2};
        int[] expected = {2, 1};

        SetMismatch solver = new SetMismatch();
        assertAll("모든 구현 방식 검증",
                () -> assertArrayEquals(expected, solver.findErrorNums(input.clone())),
                () -> assertArrayEquals(expected, solver.usingExtraArray(input.clone()))
        );
    }

}