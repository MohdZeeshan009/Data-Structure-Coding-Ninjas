import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		int countPair=0;
		if(size==0) {
			return 0;
		}
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i: input) {
			if(map.containsKey(-i) && map.get(-i)!=0) {
				countPair+=map.get(-i);
			}
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
			
		}
		return countPair;

	}
}