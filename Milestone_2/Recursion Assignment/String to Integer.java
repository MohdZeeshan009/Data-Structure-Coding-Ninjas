
public class solution {

	public static int convertStringToInt(String input){
	if(input.length()==1) {
			return (input.charAt(0)-'0');
		}
		double small= convertStringToInt(input.substring(1));
		double x=input.charAt(0)-'0';
		x=x*Math.pow(10, input.length()-1)+small;
		return (int)(x);
		
	
	}
}
