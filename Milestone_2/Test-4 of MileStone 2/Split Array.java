
public class solution {

	public static boolean helper(int input[],int n,int start, int lsum, int rsum) {
		
		if(start==n) {
			return lsum==rsum;
		}
		if(input[start]%5==0) {
			lsum+=input[start];
		}
		else if(input[start]%3==0) {
			rsum+=input[start];
		}
		else
			return helper(input, n, start+1, lsum+input[start], rsum)||helper(input, n, start+1, lsum, rsum+input[start]);
		return helper(input, n, start+1, lsum, rsum);		
	}
	

	public static boolean splitArray(int input[]) {
		return helper(input, input.length, 0, 0, 0);
		
	}
	

}
