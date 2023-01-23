public class solution {


	public static String getOption(int n) {
		if(n==2) {
			return "abc";
		}
		if(n==3) {
			return "def";
		}
		if(n==4) {
			return "ghi";
		}
		if(n==5) {
			return "jkl";
		}
		if(n==6) {
			return "mno";
		}
		if(n==7) {
			return "pqrs";
		}
		if(n==8) {
			return "tuv";
		}
		if(n==9) {
			return "wxyz";
		}
		return null;
	}
	public static void printKeypad(int n, String stringSoFar) {
		
		if(n==0) {
			System.out.println(stringSoFar);
			return;
		}
		int lastDigit=n%10;
		int smallInput=n/10;
		String optionLastDigit=getOption(lastDigit);
		for(int i=0; i<optionLastDigit.length();i++) {
			printKeypad(smallInput, optionLastDigit.charAt(i) +stringSoFar);
		}

	}


	public static void printKeypad(int input){
		// Write your code here
		printKeypad(input, "");
	}
}
