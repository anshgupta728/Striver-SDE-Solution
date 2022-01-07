public class MergeTwoSortedArrays_Day2 {
    static void print(int arr1[], int arr2[]){
        for(int ele: arr1)
            System.out.print(ele+" ");
        for(int ele: arr2)
            System.out.print(ele+" ");
        System.out.println();
    }
    static int nextGap(int gap){
        if(gap<=1){
            return 0;
        }
        return (gap/2)+(gap%2);
    }
    static void merge(int arr1[], int n, int arr2[], int m){
        int i,j,gap=m+n;
        for(gap=nextGap(gap);gap>0;gap=nextGap(gap)){
            for (i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }
            for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
            if (j < m) {
                for (j = 0; j + gap < m; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int arr1[]={1,4,7,8,10};
        int arr2[]={2,3,9};
        print(arr1,arr2);
        merge(arr1,arr1.length,arr2,arr2.length);
        print(arr1,arr2);
    }
}
