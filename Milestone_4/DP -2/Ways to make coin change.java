public class Solution {

    public static int countWaysToMakeChange(int[] denominations, int value) {
        if (denominations.length == 0) return 0;
        int[][] dp = new int[denominations.length][value + 1];
        for (int i = 0; i < denominations.length; i++) {
            dp[i][0]=1;
            for (int j = 1; j <= value; j++) {
                int count1 = 0, count2 = 0;
                if (i - 1 >= 0) count1 = dp[i - 1][j];
                if (j - denominations[i] >= 0) count2 = dp[i][j - denominations[i]];
                dp[i][j] = count1 + count2;
            }
        }
        return dp[denominations.length - 1][value];
    }
}