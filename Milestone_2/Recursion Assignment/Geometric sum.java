
public class solution {

	public static double findGeometricSum(int k){
		return 1+ findgeoSum(k, 1, 0.5);
	}
	
	public static double findgeoSum(int k, double a, double d) {
		if(k==0) {
			return 0 ;
		}
		
		return a*d + findgeoSum(--k, a*d, d);
		
	}
}
