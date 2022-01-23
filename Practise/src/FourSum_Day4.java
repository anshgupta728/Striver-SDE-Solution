import java.util.*;
public class FourSum_Day4 {
    public static HashSet<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> s=new HashSet<List<Integer>>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int searchValue=target-nums[i]-nums[j];
                int start=j+1,end=nums.length-1;
                while(start<end){
                    if(nums[start]+nums[end]==searchValue){
                        List<Integer> res=new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[start]);
                        res.add(nums[end]);
                        s.add(res);
                        break;
                    }
                    else if(nums[start]+nums[end]<searchValue)
                        start++;
                    else
                        end--;
                }
            }
        }
        return s;
    }
    public static void main(String args[]){
        int arr[]= {10, 2, 3, 4, 5, 9, 7, 8}; int target=23;
        Arrays.sort(arr);
        System.out.println(fourSum(arr,target));
    }
}
