public class MinimumNumberofOperationstoMoveAllBallstoEachBox {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int count = 0;
        int operations = 0;
        for (int i = 0; i < n; i++) {
            res[i] = operations;
            count += boxes.charAt(i) - '0';
            operations += count;
        }
        count = 0;
        operations = 0;
        for (int i = n - 1; i >= 0; i--) {
            res[i] += operations;
            count += boxes.charAt(i) - '0';
            operations += count;
        }
        return res;
    }
}
