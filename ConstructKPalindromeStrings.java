public class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        int oddCount = 0;
        int[] freq = new int[26];
        if (s.length() < k) {
            return false;
        }
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int count : freq) {
            if (count % 2 != 0){
                oddCount++;
            }
        }
        return oddCount <= k;
    }
}
