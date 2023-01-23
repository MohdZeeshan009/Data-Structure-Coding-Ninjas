
public class Solution {

	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		//Your code goes here

		if( n==0 || maxWeight==0 ) {
			return 0 ;
		}

		if(weights[n-1]>maxWeight){
			return knapsack(weights, values, n-1, maxWeight);
		}
		else {
			int ans=values[n-1]+knapsack(weights, values, n-1, maxWeight-weights[n-1]);
			int ans1=knapsack(weights, values, n-1, maxWeight);
			return Math.max(ans, ans1);
			
		}
	}

}