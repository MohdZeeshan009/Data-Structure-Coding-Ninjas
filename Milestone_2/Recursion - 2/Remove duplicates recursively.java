public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
	 int n=s.length();
        if (n==0) return "";
        if (n==1) return s;
        if (s.charAt(n-1)==s.charAt(n-2)) return removeConsecutiveDuplicates(s.substring(0,n-1));
        if (s.charAt(0)==s.charAt(1)) return removeConsecutiveDuplicates(s.substring(1,n));
        return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1,n-1)) + s.charAt(n-1);
	}

}