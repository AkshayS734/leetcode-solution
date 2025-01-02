import java.util.Set;

public class CountVowelStringsInRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int n = words.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            prefix[i + 1] = prefix[i] + (vowels.contains(first) && vowels.contains(last) ? 1 : 0);
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            ans[i] = prefix[ri + 1] - prefix[li];
        }
        
        return ans;
    }
}
