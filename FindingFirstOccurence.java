class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = needle.length();
        int l2 = haystack.length();
        int left = 0;
        int right = l1 - 1;
        if(l1 == 0) {
            return -1;
        }
        while (right < l2) {
            if (haystack.substring(left,right+1).equals(needle)) {
                return left;
            }
            left++;
            right++;
        }
        return -1;
    }
}