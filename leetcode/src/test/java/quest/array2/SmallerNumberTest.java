package quest.array2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallerNumberTest {

    @Test
    void smallerNumbersThanCurrent_case1() {
        int[] result = new SmallerNumber().smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, result);
    }

    @Test
    void smallerNumbersThanCurrent_case2() {
        int[] result = new SmallerNumber().smallerNumbersThanCurrent(new int[]{6, 5, 4, 8});
        assertArrayEquals(new int[]{2, 1, 0, 3}, result);
    }

    @Test
    void smallerNumbersThanCurrent_case3() {
        int[] result = new SmallerNumber().smallerNumbersThanCurrent(new int[]{7, 7, 7, 7});
        assertArrayEquals(new int[]{0, 0, 0, 0}, result);
    }

    @Test
    void smallerNumbersThanCurrent_case4() {
        int[] result = new SmallerNumber().smallerNumbersThanCurrent(new int[]{3, 0, 2, 10});
        assertArrayEquals(new int[]{2, 0, 1, 3}, result);
    }

}