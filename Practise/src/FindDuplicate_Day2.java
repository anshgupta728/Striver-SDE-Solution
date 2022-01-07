import java.util.*;
public class FindDuplicate_Day2 {
    static int findDuplicate(int arr[],int n){
        int freq[]=new int[n+1];
        for(int i=0;i<=n;i++){
            if(freq[arr[i]]==0)
                freq[arr[i]]+=1;
            else
                return arr[i];
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<n+1;i++)
            arr[i]=sc.nextInt();
        System.out.println(findDuplicate(arr,n));
    }
}
