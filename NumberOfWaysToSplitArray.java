public class NumberOfWaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        long leftSum = 0;
        int validSplits = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            if (leftSum >= totalSum - leftSum) {
                validSplits++;
            }
        }
        return validSplits;
    }
}
