import java.util.Random;
public class SelectionSort {
    static void swap(int arr[],int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
    static void printArray(int arr[]){
        for(int num: arr)
            System.out.print(num+" ");
        System.out.println();
    }
    static void selectionSort(int arr[]){
        int min,n=arr.length;
        for(int i=0;i<n-1;i++) {
            min=i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[min])
                    min=j;
            }
            if(min!=i)
                swap(arr,min,i);
        }
    }
    public static void main(String args[]){
        Random rand=new Random();
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
            arr[i]= rand.nextInt(100);
        System.out.println("Before");
        printArray(arr);
        selectionSort(arr);
        System.out.println("After");
        printArray(arr);
    }
}
