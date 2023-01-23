
public class solution {

	public static int sumOfDigits(int input){
		if(input==0) {
			return 0;
		}
		int sum=0;
		sum=input%10+sumOfDigits(input/10);
		return sum;
		
	
	}
}
