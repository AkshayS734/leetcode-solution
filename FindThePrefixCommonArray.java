public class FindThePrefixCommonArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        int[] countA = new int[n + 1];
        int[] countB = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            ++countA[A[i]];
            ++countB[B[i]];
            for (int j = 1; j <= n; ++j) {
                res[i] += Math.min(countA[j], countB[j]);
            }
        }
        return res;
    }
}
