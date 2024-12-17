public class ConstructStringWithRepeatLimits {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder res = new StringBuilder();
        int lastChar = -1;
        
        while (true) {
            int maxChar = -1;
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0 && i != lastChar) {
                    maxChar = i;
                    break;
                }
            }

            if (maxChar == -1){
                break;
            }

            int limit = Math.min(freq[maxChar], (res.length() > 0 && lastChar == maxChar) ? repeatLimit - 1 : repeatLimit);
            for (int i = 0; i < limit; i++) {
                res.append((char) (maxChar + 'a'));
            }
            freq[maxChar] -= limit;
            if (limit < repeatLimit && freq[maxChar] > 0) {
                lastChar = maxChar;
            } else {
                lastChar = -1;
            }
            if (freq[maxChar] > 0) {
                int nextChar = -1;
                for (int i = 25; i >= 0; i--) {
                    if (freq[i] > 0 && i != maxChar) {
                        nextChar = i;
                        break;
                    }
                }
                if (nextChar == -1){
                    break;
                }
                res.append((char) (nextChar + 'a'));
                freq[nextChar]--;
                lastChar = nextChar;
            }
        }
        return res.toString();
    }
}