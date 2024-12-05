public class MovePiecesToObtainAString {
    public boolean canChange(String start, String target) {
        if (!start.replace("_", "").equals(target.replace("_", ""))) {
            return false;
        }
        int n = start.length();
        int i = 0, j = 0;

        while (i < n && j < n) {
            while (i < n && start.charAt(i) == '_') i++;
            while (j < n && target.charAt(j) == '_') j++;
            if (i == n && j == n) return true;
            if (i == n || j == n) return false;
            char sChar = start.charAt(i);
            char tChar = target.charAt(j);

            if (sChar != tChar) return false;
            if (sChar == 'L' && i < j) return false;
            if (sChar == 'R' && i > j) return false;

            i++;
            j++;
        }

        return true;
    }
}
