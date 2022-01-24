import java.util.HashMap;
public class MajorityElementNby2_Day3 {
//    static int majority(int arr[]){
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//                if(map.get(arr[i])> arr.length/2)
//                    return arr[i];
//            }
//            else
//                map.put(arr[i],1);
//        }
//        return -1;
//    }

    //There is always a majority element (Moore's Voting Algorithm)
    static int majority(int arr[]){
        int count=0;
        int candidate=-1;

        for(int num:arr){
            if(count==0)
                candidate=num;
            if(candidate==num)
                count+=1;
            else
                count-=1;
        }

        return candidate;
    }
    public static void main(String args[]){
        int arr[]={3,4,1,3,3,4,3};
        System.out.println(majority(arr));
    }
}
