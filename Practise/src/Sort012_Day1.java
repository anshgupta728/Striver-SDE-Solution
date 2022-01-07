public class Sort012_Day1 {
    static void swap(int arr[],int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
    static void sort(int arr[]){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,1,0,1,0,2,0,1,1,2,2,0,1};
        sort(arr);
        for(int ele:arr)
            System.out.print(ele+" ");
    }
}
