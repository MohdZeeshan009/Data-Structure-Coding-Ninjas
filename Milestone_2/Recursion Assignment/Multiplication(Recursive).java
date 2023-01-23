
public class solution {

	public static int multiplyTwoIntegers(int m, int n){
	if(n==0) {
			return 0;
			}
		int smalloutput=m+multiplyTwoIntegers(m, n-1);
		return smalloutput;
		
	
	}
}
