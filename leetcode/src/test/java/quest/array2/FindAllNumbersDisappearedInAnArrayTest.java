package quest.array2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    void findDisappearedNumbers_case1() {
        List<Integer> actual = new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        List<Integer> answer = List.of(5, 6);

        assertEquals(answer, actual);
    }

    @Test
    void findDisappearedNumbers_case2() {
        List<Integer> actual = new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{1, 1});
        List<Integer> answer = List.of(2);

        assertEquals(answer, actual);
    }

    @Test
    void findDisappearedNumbers_case3() {
        List<Integer> actual = new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{1, 3, 2, 1, 6, 4, 6, 9, 4, 3, 2, 12});
        List<Integer> answer = List.of(5, 7, 8, 10, 11);

        assertEquals(answer, actual);
    }

}