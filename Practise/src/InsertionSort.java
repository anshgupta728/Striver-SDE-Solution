import java.util.Random;
public class InsertionSort {
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
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String args[]){
        Random rand=new Random();
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
            arr[i]= rand.nextInt(100);
        System.out.println("Before");
        printArray(arr);
        insertionSort(arr);
        System.out.println("After");
        printArray(arr);
    }
}
