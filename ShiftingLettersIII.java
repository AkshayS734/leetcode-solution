public class ShiftingLettersIII {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shift = new int[n + 1];
        for (int[] sh : shifts) {
            int start = sh[0], end = sh[1], direction = sh[2];
            if (direction == 1) {
                shift[start] += 1;
                if (end + 1 < n) shift[end + 1] -= 1;
            } else {
                shift[start] -= 1;
                if (end + 1 < n) shift[end + 1] += 1;
            }
        }
        int netShift = 0;
        char[] result = s.toCharArray();
        for (int i = 0; i < n; i++) {
            netShift += shift[i];
            int effectiveShift = (netShift % 26 + 26) % 26;
            result[i] = (char) ('a' + (result[i] - 'a' + effectiveShift) % 26);
        }

        return new String(result);
    }
}
