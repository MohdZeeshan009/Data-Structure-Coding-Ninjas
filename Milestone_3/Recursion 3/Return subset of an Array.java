
import java.util.ArrayList;

public class solution {

    public static void subsets(int[] input, int index, String set, ArrayList<Integer> arrayList) {
        if (index == input.length) {
            if (set.equals("")) {
                arrayList.add(null);
                return;
            }
            for (String s:set.split(" ")){
                arrayList.add(Integer.parseInt(s));
            }
            arrayList.add(null);
            return;
        }
        subsets(input, index + 1, set + input[index] + " ", arrayList);
        subsets(input,index+1,set,arrayList);
    }

    public static int[][] subsets(int[] input) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        subsets(input, 0, "", arrayList);
        int row = 0,col=0;
        for (Integer i :arrayList) if (i==null) row++;
        int[][] subsets = new int[row][];
        row = 0;
        for (Integer i :arrayList){
            if (i==null){
                subsets[row++] = new int[col];
                col = 0;
            }else col++;
        }
        int k =0;
        for (int i =0;i<subsets.length;i++){
            for (int j=0;j<subsets[i].length;j++){
                subsets[i][j] = arrayList.get(k++);
            }
            k++;
        }
        return subsets;
    }
}