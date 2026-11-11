package quest.array2;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[nums.length];
        int[] output = new int[2];

        for (int n : nums) {
            int index = n - 1;

            if (answer[index] != 0) {
                output[0] = n;
            } else {
                answer[index] = n;
            }

        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                output[1] = i + 1;
            }
        }

        return output;
    }

    public int[] usingExtraArray(int[] nums) {
        int[] arr = new int[nums.length + 1];
        int duplicate = 0;
        int loss = 0;

        for (int num : nums) {
            arr[num] += 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                loss = i;
            } else if (arr[i] == 2) {
                duplicate = i;
            }
        }

        return new int[]{duplicate, loss};
    }


}
