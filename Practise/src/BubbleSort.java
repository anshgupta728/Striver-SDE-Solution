import java.util.Random;
public class BubbleSort {
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
    static void bubbleSort(int arr[]){
        //Normal Bubble Sort -> O(n*n) for all cases
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
//      Improvised Bubble Sort -> O(n*n) for worst and average and O(n) for best case
//		boolean swapped=false;
//		for(int i=0;i<arr.length-1;i++) {
//			swapped=false;
//			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j+1]<arr[j]) {
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//					swapped=true;
//				}
//				if(!swapped)
//					break;
//			}
//		}
    }
    public static void main(String args[]){
        Random rand=new Random();
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
            arr[i]= rand.nextInt(100);
        System.out.println("Before");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("After");
        printArray(arr);
    }
}
