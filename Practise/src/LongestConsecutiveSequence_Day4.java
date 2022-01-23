import java.util.*;
public class LongestConsecutiveSequence_Day4 {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int num:nums)
            s.add(num);

        int longestLength=0;
        for(int num:nums){
            if(!s.contains(num-1)){
                int currentNum=num;
                int currLength=1;
                while(s.contains(currentNum+1)){
                    currentNum+=1;
                    currLength+=1;
                }
                longestLength=Math.max(currLength,longestLength);
            }
        }
        return longestLength;
    }
    public static void main(String args[]){
        int arr[]={102,4,100,1,101,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
