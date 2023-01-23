
public class solution {

	public static int countZerosRec(int input){
		// Write your code here
		if(input==0) 
			return 1;
		if(input/10==0)
			return 0;
		if(input%10==0) 
			return 1+countZerosRec(input/10);
			return countZerosRec(input/10);
		
	}
}
