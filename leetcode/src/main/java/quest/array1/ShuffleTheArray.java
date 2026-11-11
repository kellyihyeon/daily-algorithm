package quest.array1;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            int index = i * 2;
            int x = nums[i];
            int y = nums[i + n];

            ans[index] = x;
            ans[index + 1] = y;
        }

        return ans;
    }

}
