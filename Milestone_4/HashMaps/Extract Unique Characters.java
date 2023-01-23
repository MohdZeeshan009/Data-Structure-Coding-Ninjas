import java.util.HashMap;

public class Solution {

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.

		*/
		int n=str.length();
		String str1="";
		HashMap<Character, Boolean> map=new HashMap<>();
		for(int i=0; i<n;i++) {
			if(map.containsKey(str.charAt(i))){
				continue;
			}
			str1+=str.charAt(i);
			map.put(str.charAt(i), true);
		}
		return str1;
	

	}
}