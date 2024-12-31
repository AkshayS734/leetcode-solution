public class MinimumCostForTickets {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[days[n - 1] + 1];
        boolean[] travelDays = new boolean[days[n - 1] + 1];
        
        for (int day : days) travelDays[day] = true;
        
        for (int i = 1; i < dp.length; i++) {
            if (!travelDays[i]) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = Math.min(
                    dp[i - 1] + costs[0],
                    Math.min(
                        dp[Math.max(0, i - 7)] + costs[1],
                        dp[Math.max(0, i - 30)] + costs[2]
                    )
                );
            }
        }
        
        return dp[days[n - 1]];
    }
}
