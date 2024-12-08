public class MinimumLimitofBallsInABag {
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int r = 0;
        for (int n : nums) {
            r = Math.max(r, n);
        }
        while(l < r) {
            int m = (l + r) / 2;
            int count = 0;
            for (int n : nums) {
                count += (n - 1) / m;
            }
            if (count <= maxOperations) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
