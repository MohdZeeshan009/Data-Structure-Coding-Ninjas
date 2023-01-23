import java.util.HashMap;
public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
		HashMap<Integer, Integer> map= new HashMap<>();
		int maxlen=0;
		int sum=0;
		int i=-1;
		map.put(sum, i);
		while(i<arr.length-1) {
			i++;
			sum+=arr[i];
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
			else {
				int len=i-map.get(sum);
				if(len>maxlen) {
					maxlen=len;
				}
			}
		}
		return maxlen;
	}
}