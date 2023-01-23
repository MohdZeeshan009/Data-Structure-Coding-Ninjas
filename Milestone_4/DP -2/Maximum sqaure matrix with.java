public class Solution {

    public static int findMaxSquareWithAllZeros(int[][] input){
        if (input.length==0) return 0;
        int[][] dp = new int[input.length][input[0].length];
        int max =0 ;
        for (int i=0;i<input.length;i++){
            for (int j=0;j<input[i].length;j++){
                if (input[i][j]==0){
                    if (i-1>=0 && j-1>=0){
                        dp[i][j] = 1 + Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                        if (dp[i][j]>max) max = dp[i][j];
                    }else dp[i][j] = 1;
                }
            }
        }
        return max;
    }
}
