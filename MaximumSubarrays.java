class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < k) {
            return 0;
        }
        long sum = 0;
        int uniqueCount = 0;
        int[] freq = new int[100001];
        for (int i = 0; i < k; ++i) {
            sum += nums[i];
            if (freq[nums[i]] == 0) {
                uniqueCount++;
            }
            freq[nums[i]]++;
        }

        long maxSum = (uniqueCount == k) ? sum : 0;
        for (int i = k; i < n; ++i) {
            sum += nums[i];
            if (freq[nums[i]] == 0) {
                uniqueCount++;
            }
            freq[nums[i]]++;
            sum -= nums[i - k];
            freq[nums[i - k]]--;
            if (freq[nums[i - k]] == 0) {
                uniqueCount--;
            }
            if (uniqueCount == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
