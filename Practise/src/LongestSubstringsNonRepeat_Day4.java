import java.util.HashMap;
public class LongestSubstringsNonRepeat_Day4 {
    static int maxLength(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,right=0,length=0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(map.get(s.charAt(right))+1,left);
            }
            map.put(s.charAt(right),right);
            length=Math.max(length,right-left+1);
            right++;
        }
        return length;
    }
    public static void main(String args[]){
        String s="abcabcbb";
        System.out.println(maxLength(s));
    }
}
