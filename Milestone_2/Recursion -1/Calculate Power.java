public class Solution {

	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}

			int power=x*power(x, n-1);
			return power;
		}
		
	}
