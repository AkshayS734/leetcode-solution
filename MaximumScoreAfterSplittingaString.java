public class MaximumScoreAfterSplittingaString {
    public int maxScore(String s) {
        int n = s.length();
        int res = 0;
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalOnes++;
            }
        }
        int leftZeros = 0;
        int rightOnes = totalOnes;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }
            int currentScore = leftZeros + rightOnes;
            res = Math.max(res, currentScore);
        }
        return res;
    }
}
