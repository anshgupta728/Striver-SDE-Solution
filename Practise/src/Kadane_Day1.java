public class Kadane_Day1 {
    static int kadane(int arr[]){
        int sum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxSum=Math.max(sum,maxSum);
            if(sum<0)
                sum=0;
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadane(arr));
    }
}
