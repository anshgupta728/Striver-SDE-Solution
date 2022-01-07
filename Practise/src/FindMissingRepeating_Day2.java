import java.util.*;
public class FindMissingRepeating_Day2 {
    static void findMissRep(int arr[]){
        int freq[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]+=1;
        }
        for(int i=1;i<arr.length;i++){
            if(freq[i]==0)
                System.out.println("Missing= "+i);
            else if(freq[i]==2)
                System.out.println("Repeating= "+i);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        findMissRep(arr);
    }
}
