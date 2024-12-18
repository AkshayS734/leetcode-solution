public class FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = prices[i];
            for (int j = i + 1; j < len; j++) {
                if (prices[j] <= prices[i]) {
                    res[i] -= prices[j];
                    break;
                }
            }
        }

        return res;
    }
}
