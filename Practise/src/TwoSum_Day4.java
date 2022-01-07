import java.util.HashMap;
import java.util.Map;
public class TwoSum_Day4 {
    static int[] twosum(int arr[],int target){
        int result[]=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
           if(map.containsKey(target-arr[i])){
               result[0]=map.get(target-arr[i]);
               result[1]=i;
               return result;
           }
           map.put(arr[i],i);
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]={2,7,11,15}; int target = 9;
        int result[]=twosum(arr,target);
        for(int ele:result)
            System.out.print(ele+" ");
    }
}
