package quest.array2;

public class SmallerNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            int target = nums[i];

            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }

                if (target > nums[j]) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }

}
