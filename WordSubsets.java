import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] maxFreq = new int[26];
        for (String b : words2) {
            int[] freq = countFrequency(b);
            for (int i = 0; i < 26; i++){
                maxFreq[i] = Math.max(maxFreq[i],freq[i]);
            }
        }
        for (String a : words1){
            int[] freqA = countFrequency(a);
            if (universal(freqA,maxFreq)){
                result.add(a);
            }
        }
        return result;
    }
    int[] countFrequency(String word){
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
    boolean universal(int[] freqA, int[] maxFreq){
        for (int i = 0; i < 26; i++) {
            if (freqA[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
}
