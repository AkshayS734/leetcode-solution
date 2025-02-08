public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int[] jewelSet = new int[128];
        for (char ch : jewels.toCharArray()) {
            jewelSet[ch] = 1;
        }
        for (char ch : stones.toCharArray()) {
            count += jewelSet[ch];
        }
        return count;
    }
}
