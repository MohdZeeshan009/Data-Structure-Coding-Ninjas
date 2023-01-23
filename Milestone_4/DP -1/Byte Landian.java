import java.util.HashMap;
public class Solution {

    public static long bytelandian(long n, HashMap<Long, Long> memo) {
        if (n==0) return 0;
        if (memo.get(n/2)==null) memo.put(n/2,bytelandian(n/2,memo));
        if (memo.get(n/3)==null) memo.put(n/3,bytelandian(n/3,memo));
        if (memo.get(n/4)==null) memo.put(n/4,bytelandian(n/4,memo));
        return Math.max(n,memo.get(n/2)+memo.get(n/3)+memo.get(n/4));
    }
}