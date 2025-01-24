public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) { //predefined function on leetcode, not available locally
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
