import java.util.Arrays;
public class NextPermutation_Day1 {
    static void swap(int arr[],int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
    static void nextPermutation(int arr[]){
        int i;
        for(i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1])
                break;
        }
        if(i==0)
            Arrays.sort(arr);
        else{
            int digit=arr[i-1],nextGreater=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>digit && arr[j]<arr[nextGreater])
                    nextGreater=j;
            }
            swap(arr,i-1,nextGreater);
            Arrays.sort(arr,i,arr.length);
        }
    }
    public static void main(String args[]){
        int arr[]={5,3,4,9,7,6};
        for(int ele:arr)
            System.out.print(ele);
        System.out.println();
        nextPermutation(arr);
        for(int ele:arr)
            System.out.print(ele);
    }
}
