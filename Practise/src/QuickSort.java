import java.util.Random;
public class QuickSort {
    static void printArray(int arr[]){
        for(int num: arr)
            System.out.print(num+" ");
        System.out.println();
    }
    static void swap(int arr[],int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
    static int partition(int arr[],int low,int high){
        //Selecting Pivot as a random element from the array
        //int pivotIndex=new Random().nextInt(high-low)+low;
        //int pivot=arr[pivotIndex];
        //swap(arr,pivotIndex,high);

        //Selecting Pivot as the last element of the array
        int pivot=arr[high];
        int left=low,right=high;
        while(left<right){
            while(arr[left]<=pivot && left<right)
                left++;
            while(arr[right]>=pivot && left<right)
                right--;
            swap(arr,left,right);
        }
        swap(arr,left,high);
        return left;
    }
    static void quickSort(int arr[],int low,int high){
        if(low>=high)
            return;
        int pivotPos=partition(arr,low,high);
        quickSort(arr,low,pivotPos-1);
        quickSort(arr,pivotPos+1,high);
    }
    public static void main(String args[]){
        Random rand=new Random();
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
            arr[i]= rand.nextInt(100);
        System.out.println("Before");
        printArray(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println("After");
        printArray(arr);
    }
}
