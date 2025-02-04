public class MaximumAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0], res = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                sum += nums[i + 1];
            } else {
                res = Math.max(res, sum);
                sum = nums[i + 1];
            }
        }
        return Math.max(res, sum);
    }
}
