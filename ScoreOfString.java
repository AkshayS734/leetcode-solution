public class ScoreOfString {
    public int scoreOfString(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            res += Math.abs((s.charAt(i + 1) - 'a') - (s.charAt(i) - 'a'));
        }
        return res;
    }
}
