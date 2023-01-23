import java.util.HashMap;

public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			} else
				hashMap.put(arr[i], 1);
			if (k == 0)
				count += hashMap.get(arr[i]) - 1;
		}
		if (k == 0)
			return count;
		for (int i = 0; i < arr.length; i++) {
			if (hashMap.containsKey(arr[i] - k)) {
				count += hashMap.get(arr[i] - k);
				hashMap.remove(arr[i]);
			}
			if (hashMap.containsKey(arr[i] + k)) {
				count += hashMap.get(arr[i] + k);
				hashMap.remove(arr[i]);
			}
		}
		return count;
	}
}