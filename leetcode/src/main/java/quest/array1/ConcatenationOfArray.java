package quest.array1;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        int[] result = concatenationOfArray.getConcatenation2(new int[]{1, 2, 1, 34, 2, 4});

        System.out.println(Arrays.toString(result));
    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            int value = nums[i];
            ans[i] = value;
            ans[i + n] = value;
        }

        return ans;
    }

    public int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }


}
