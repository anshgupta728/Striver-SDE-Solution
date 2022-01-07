import java.util.Arrays;
public class TripletSumProblem {
//    static boolean find(int arr[],int sum,
//                        int start,int end){
//        while(start<end){
//            if(arr[start]+arr[end]==sum) {
//                System.out.print(arr[start] + " " + arr[end]+" ");
//                return true;
//            }
//            else if(arr[start]+arr[end]<sum)
//                start++;
//            else
//                end--;
//        }
//        return false;
//    }
    static void threesum(int arr[],int sum) {
//        O(n*n*n)
//        for (int i = 0; i < arr.length - 2; i++) {
//            for (int j = i + 1; j < arr.length - 1; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    if (arr[i] + arr[j] + arr[k] == sum)
//                        System.out.println(arr[i] + " " + arr[j]+" "+arr[k]);
//                }
//            }
//        }

//        O(n*n)
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length-2;i++) {
//            int temp=arr[i];
//            if(find(arr,sum-temp,i+1,arr.length-1))
//                System.out.println(temp);
//        }


    }
    public static void main(String args[]){
        int arr[]={12, 3, 4, 1, 6, 9, 14};
        int sum = 24;
        threesum(arr,sum);
    }
}
