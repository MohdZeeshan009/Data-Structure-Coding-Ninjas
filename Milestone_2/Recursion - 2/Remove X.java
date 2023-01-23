
public class solution {

	public static String removeX(String input, char a, char b){
		
		if(input.length()==0) {
			return input;
		}
		String smallOutput=removeX(input.substring(1), a, b);
		if(input.charAt(0)==a) {
			return smallOutput;
		}
		else {
			return input.charAt(0)+smallOutput;
		}
		
		
	}
	public static String removeX(String input){
		return removeX(input, 'x' , ' ');
	}
}
