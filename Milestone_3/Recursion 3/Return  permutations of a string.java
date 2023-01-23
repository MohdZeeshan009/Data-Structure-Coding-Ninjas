import java.util.ArrayList;

public class solution {

    public static void permutationOfString(String string,String ans,ArrayList<String> arrayList){
        if (string.length()==0) {
            arrayList.add(ans);
            return;
        }
        for (int i =0;i<string.length();i++){
            permutationOfString(string.substring(0,i)+string.substring(i+1),ans+string.charAt(i),arrayList);
        }
    }

    public static String[] permutationOfString(String input){
        ArrayList<String> arrayList = new ArrayList<>();
        permutationOfString(input,"",arrayList);
        String[] strings = new String[arrayList.size()];
        for (int i =0;i<arrayList.size();i++){
            strings[i] = arrayList.get(i);
        }
        return strings;
    }
}