package quest.array1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ShuffleTheArrayTest {

    @ParameterizedTest(name = "nums={0}, n={1}")
    @MethodSource("shuffleCases")
    void shuffle_equals(int[] nums, int n, int[] expected) {
        int[] ans = new ShuffleTheArray().shuffle(nums, n);
        assertArrayEquals(expected, ans);
    }

    public static Stream<Object[]> shuffleCases() {
        return Stream.of(
                new Object[]{
                        new int[]{2, 5, 1, 3, 4, 7},
                        3,
                        new int[]{2, 3, 5, 4, 1, 7}
                },
                new Object[]{
                        new int[]{1, 2, 3, 4, 4, 3, 2, 1},
                        4,
                        new int[]{1, 4, 2, 3, 3, 2, 4, 1}
                },
                new Object[]{
                        new int[]{1, 1, 2, 2},
                        2,
                        new int[]{1, 2, 1, 2}
                }
        );
    }

}