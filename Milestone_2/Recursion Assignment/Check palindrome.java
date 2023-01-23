
public class solution {

	public static boolean isStringPalindrome(String input) {
		int n=input.length();
		if(n<=1) {
			return true ;
		}
		else if(input.charAt(0)!=input.charAt(n-1)) {
			return false;
		}
		return isStringPalindrome(input.substring(1,n-1));
		
	}

}