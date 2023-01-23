import java.util.Arrays;

public class Solution {

    public static String findWinner(int n, int x, int y) {
        boolean[] dp = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (!dp[i - 1]) dp[i] = true;
            if (i - x >= 0 && !dp[i - x]) dp[i] = true;
            if (i - y >= 0 && !dp[i - y]) dp[i] = true;
        }
        if (dp[n]) return "Beerus";
        return "Whis";
    }
}