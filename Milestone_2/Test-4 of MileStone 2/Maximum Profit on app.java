import java.util.Arrays;

public class solution {

	public static int maximumProfit(int budget[]) {
	int ans = Integer.MIN_VALUE;
	        int price = 0;
	        Arrays.sort(budget);
	        int N = budget.length;
	        for (int i = 0; i < N; i++) {
	            int count = (N - i);
	            if (ans < count * budget[i]) {
	                price = budget[i];
	                ans = count * budget[i];
	            }
	        }
	        return ans;
	}
}

