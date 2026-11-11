package quest.array2;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        int[] arr = new int[length];

        for (int num : nums) {
            int index = num - 1;
            arr[index] += 1;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
