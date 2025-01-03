import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedStr = String.valueOf(arr);
            map.computeIfAbsent(sortedStr, _ -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
