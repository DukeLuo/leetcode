import java.util.Arrays;

class _1480RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = nums[i];
            } else {
                result[i] = nums[i] + result[i - 1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _1480RunningSumOf1dArray solution = new _1480RunningSumOf1dArray();
        System.out.println(Arrays.toString(solution.runningSum(new int[]{3, 1, 2, 10, 1})));
    }
}