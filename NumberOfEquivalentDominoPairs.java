import java.util.HashMap;

public class NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int[] arr : dominoes) {
        int key = arr[0] < arr[1] ? arr[0] * 10 + arr[1] : arr[1] * 10 + arr[0];
        res += map.getOrDefault(key, 0);
        map.put(key, map.getOrDefault(key, 0) + 1);
    }
        return res;
    }
}
