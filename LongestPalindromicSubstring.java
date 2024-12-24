public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int start = 0, maxLength = 1;
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < len - 1; i++){
            if (s.charAt(i) == s.charAt(i + 1)){
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        for (int length = 3; length <= len; length++) {
            for (int i = 0; i <= len - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = length;
                }
            }
        }
        return s.substring(start, start + maxLength);
    }
}
