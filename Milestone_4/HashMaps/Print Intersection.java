import java.util.HashMap;
import java.util.Arrays;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i: arr1) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
				continue;
			}
			map.put(i, map.get(i)+1);
		}
		Arrays.sort(arr2);
		for(int j: arr2) {
			if(map.containsKey(j)&& map.get(j)>0) {
				System.out.print(j+" ");
				map.put(j, map.get(j)-1);
			}
		}
	}

}