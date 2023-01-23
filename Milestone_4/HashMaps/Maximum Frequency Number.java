import java.util.HashMap;
import java.util.Map.Entry;
public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int n=arr.length;
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			int key=arr[i];
			if(!map.containsKey(key)) {
				map.put(key, 1);
				continue;
			}
			map.put(key, map.get(key)+1);
		}
		int max=arr[0];
		for(int i: arr) {
			if(map.get(i)>map.get(max)) {
				max=i;
			}
		}
		return max;
    }
}

