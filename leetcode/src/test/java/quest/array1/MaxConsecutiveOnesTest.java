package quest.array1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {

    @Test
    void findMaxConsecutiveOnes_case1() {
        int answer = new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,0,0,1,1,1,1,1,1});
        assertEquals(6, answer);
    }

    @Test
    void findMaxConsecutiveOnes_case2() {
        int answer = new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
        assertEquals(3, answer);
    }

    @Test
    void findMaxConsecutiveOnes_case3() {
        int answer = new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1});
        assertEquals(2, answer);
    }

}