import java.util.HashMap;
class LargestSubarrayWithZeroSum_Day4 {
    static int findMax(int a[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxLen=0,sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==0){
                maxLen=i+1;
            }
            else{
                if(map.containsKey(sum))
                    maxLen=Math.max(maxLen,i-map.get(sum));
                else
                    map.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String args[]){
        int a[]={1,-1,3,2,-2,-8,1,7,10,23};
        System.out.println(findMax(a));
    }
}

//    static int findMax(int a[]){
//        int maxLen=0;
//        for(int i=0;i<a.length;i++){
//            int sum=0;
//            for(int j=i;j<a.length;j++){
//                sum+=a[j];
//                if(sum==0)
//                    maxLen=Math.max(maxLen,j-i+1);
//            }
//        }
//        return maxLen;
//    }