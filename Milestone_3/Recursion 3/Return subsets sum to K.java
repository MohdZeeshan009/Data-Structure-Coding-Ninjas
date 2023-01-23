import java.util.ArrayList;

public class solution {

    public static void subsetsSumK(int[] input, int index, int sum, String set, int tar, ArrayList<Integer> arrayList) {
        if (sum > tar) return;
        if (index == input.length) {
            if (sum == tar) {
                for (String s : set.split(" ")) {
                    arrayList.add(Integer.parseInt(s));
                }
                arrayList.add(null);
            }
            return;
        }
        subsetsSumK(input, index + 1, sum + input[index], set + input[index] + " ", tar, arrayList);
        subsetsSumK(input, index + 1, sum, set, tar, arrayList);
    }

    public static int[][] subsetsSumK(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        subsetsSumK(input, 0, 0, "", k,arrayList);
        int row = 0;
        for (Integer i : arrayList) if (i == null) row++;
        int[][] mainArray = new int[row][];
        int col = 0;
        row = 0;
        for (Integer i : arrayList) {
            if (i == null) {
                mainArray[row] = new int[col];
                row++;
                col = 0;
            } else col++;
        }
        int index=0;
        for (int i =0;i<mainArray.length;i++){
            for (int j=0;j<mainArray[i].length;j++){
                mainArray[i][j] = arrayList.get(index++);
            }
            index++;
        }
        return mainArray;
    }
}
