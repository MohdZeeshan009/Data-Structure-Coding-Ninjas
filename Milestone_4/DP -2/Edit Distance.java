public class Solution {

    public static int editDistance(String s, String t,int i) {
        if (s.equals(t)) return i;
        if (s.charAt(0)==t.charAt(0)) return editDistance(s.substring(1),t.substring(1),i);
        if (s.charAt(s.length()-1)==t.charAt(t.length()-1)) return editDistance(s.substring(0,s.length()-1),t.substring(0,t.length()-1),i);
        int ans1,ans2;
        if (s.length()==t.length()){
            ans1 = editDistance(s.substring(0,s.length()-1),t.substring(0,t.length()-1),i+1);
            ans2 =  editDistance(s.substring(1),t.substring(1),i+1);
            return Math.min(ans1,ans2);
        }
        if (s.length()<t.length()){
            ans1 = editDistance(s,t.substring(1),i+1);
            ans2 = editDistance(s,t.substring(0,t.length()-1),i+1);
            return Math.min(ans1,ans2);
        }
        ans1 = editDistance(s.substring(1),t,i+1);
        ans2 = editDistance(s.substring(0,s.length()-1),t,i+1);
        return Math.min(ans1,ans2);
    }

    public static int editDistance(String s, String t) {
        return editDistance(s,t,0);
    }
}