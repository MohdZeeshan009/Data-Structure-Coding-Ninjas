import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
			HashMap<Integer, Boolean> map=new HashMap<>();
		ArrayList<Integer> arr1=new ArrayList<>();
		for(int val: arr) {
			map.put(val, true);
		}
		for(int val: arr) {
			if(map.containsKey(val-1)) {
				map.put(val, false);
			}
		}
		int msp=0;
		int ml=0;
		for(int val: arr) {
			if(map.get(val)==true) {
				int tl=0;
				int tsp=val;
				while(map.containsKey(tsp+tl)) {
					tl++;
				}
				if(tl>ml) {
					msp=tsp;
					ml=tl;
				}
			}
		}
		arr1.add(msp);
		arr1.add(ml+msp-1);
		return arr1;
    }
}