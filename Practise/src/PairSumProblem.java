import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class PairSumProblem {
    static void twosum(int arr[],int sum){
//        O(n*n)
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==sum)
//                    System.out.println(arr[i]+" "+arr[j]);
//            }
//        }

//        O(n*logn)
//        Arrays.sort(arr);
//        int start=0,end=arr.length-1;
//        while(start<end){
//            if(arr[start]+arr[end]==sum) {
//                System.out.println(arr[start] + " " + arr[end]);
//                start++;
//                end--;
//            }
//            else if(arr[start]+arr[end]<sum)
//                start++;
//            else
//                end--;
//        }

//        O(n)
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(s.contains(sum-arr[i]))
                System.out.println(arr[i]+" "+(sum-arr[i]));
            s.add(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={10,3,5,7,4,2,1,-4,6};
        int sum=6;
        twosum(arr,sum);
    }
}
